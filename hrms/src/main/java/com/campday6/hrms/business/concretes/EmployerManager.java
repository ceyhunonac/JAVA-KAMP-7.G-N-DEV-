package com.campday6.hrms.business.concretes;

import java.util.List;

import com.campday6.hrms.business.abstracts.EmployerService;

import com.campday6.hrms.core.concretes.CheckEmailManager;
import com.campday6.hrms.core.concretes.EmailVerificationManager;
import com.campday6.hrms.core.utilities.DataResult;
import com.campday6.hrms.core.utilities.ErrorDataResult;
import com.campday6.hrms.core.utilities.Result;
import com.campday6.hrms.core.utilities.SuccessDataResult;

import com.campday6.hrms.dataAccess.abstracts.EmployerDao;
import com.campday6.hrms.entities.concretes.Employers;

public class EmployerManager implements EmployerService {
	
	private EmployerDao employerDao;
	private CheckEmailManager checkEmailManager;
	private EmailVerificationManager emailVerificationManager;
	
	public EmployerManager(EmailVerificationManager emailVerificationManager) {
		super();
		this.emailVerificationManager = emailVerificationManager;
	}

	public EmployerManager(CheckEmailManager checkEmailManager) {
		super();
		this.checkEmailManager = checkEmailManager;
	}

	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employers>> getAll() {
		
		return new SuccessDataResult<List<Employers>>(employerDao.findAll(),"Data Başraıyla listelendi");
	}

	@Override
	public DataResult<List<Employers>> getAllSorted() {
		// TODO Auto-generated method stub
		return null;
	}
	

	@Override
	public DataResult<List<Employers>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(Employers employers) {
		if(checkEmailManager.checkEmail(employers.getEmail())==true && emailVerificationManager.isEmailVerified(employers)) {
			return new SuccessDataResult<List<Employers>>
			(this.employerDao.findAll(),"İşveren sisteme eklendi.");
			
			
		}else {
			return new ErrorDataResult<Employers>("İşverenin gerekli koşulları sağlamadığı tespit edildi.Bu yüzden sisteme eklenmedi.");
		}
	}

	@Override
	public DataResult<Employers> getByEmployersCompanyName(String companyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<Employers> getByCompanyNameAndPhone(String companyName, String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employers>> getByCompanyNameOrPhone(String companyName, String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employers>> getByCompanyNameContains(String companyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employers>> getByCompanyNameStartsWith(String companyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<Employers>> getByCNameAndPhone(String companyName, String phone) {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
