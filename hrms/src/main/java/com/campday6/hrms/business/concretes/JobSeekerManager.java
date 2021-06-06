package com.campday6.hrms.business.concretes;

import java.util.List;

import com.campday6.hrms.business.abstracts.JobSeekerService;
import com.campday6.hrms.core.adapters.MernisServiceAdapters;
import com.campday6.hrms.core.concretes.CheckEmailManager;
import com.campday6.hrms.core.concretes.CheckIdentityNumberManager;
import com.campday6.hrms.core.concretes.EmailVerificationManager;
import com.campday6.hrms.core.utilities.DataResult;
import com.campday6.hrms.core.utilities.ErrorDataResult;
import com.campday6.hrms.core.utilities.Result;
import com.campday6.hrms.core.utilities.SuccessDataResult;
import com.campday6.hrms.dataAccess.abstracts.JobSeekerDao;
import com.campday6.hrms.entities.concretes.Employers;
import com.campday6.hrms.entities.concretes.JobSeekers;

public class JobSeekerManager implements JobSeekerService {

private JobSeekerDao jobSeekerDao ;

private CheckEmailManager checkEmailManager;
private MernisServiceAdapters mernisCheckAdapters;
private CheckIdentityNumberManager checkIdentityNumberManager;
private EmailVerificationManager emailVerificationManager;

public JobSeekerManager(CheckIdentityNumberManager checkIdentityNumberManager) {
	super();
	this.checkIdentityNumberManager = checkIdentityNumberManager;
}

	
	public JobSeekerManager(EmailVerificationManager emailVerificationManager) {
	super();
	this.emailVerificationManager = emailVerificationManager;
}

	public JobSeekerManager(CheckEmailManager checkEmailManager) {
	super();
	this.checkEmailManager = checkEmailManager;
}

	public  JobSeekerManager(JobSeekerDao jobSeekerDao ) {
		super();
		this.jobSeekerDao = jobSeekerDao ;
	}

	@Override
	public DataResult<List<JobSeekers>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobSeekers>> getAllSorted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobSeekers>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(JobSeekers jobSeekers) {
		if(checkEmailManager.checkEmail(jobSeekers.getEmail())==true && mernisCheckAdapters.checkIfRealPerson(jobSeekers) && checkIdentityNumberManager.checkTrNu(jobSeekers.getTrNu())== true && emailVerificationManager.isEmailVerified(jobSeekers)) {
			return new SuccessDataResult<List<JobSeekers>>
			(this.jobSeekerDao.findAll(),"İş arayan sisteme eklendi.");
		}else {
			return new ErrorDataResult<JobSeekers>("İş arayan gerekli koşulları sağlamadığı tespit edildi.Bu yüzden sisteme eklenmedi.");
		}
	}

	@Override
	public DataResult<JobSeekers> getByFirstName(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobSeekers> getByFirstNameAndLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobSeekers>> getByFirstNameOrLastName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobSeekers>> getByFirstNameContains(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobSeekers>> getByFirstNameStartsWith(String firstName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobSeekers>> getByFNameAndLName(String firstName, String lastName) {
		// TODO Auto-generated method stub
		return null;
	}



}
