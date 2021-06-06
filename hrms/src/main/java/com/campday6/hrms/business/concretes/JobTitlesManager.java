package com.campday6.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.campday6.hrms.business.abstracts.JobTitlesService;
import com.campday6.hrms.core.adapters.MernisServiceAdapters;
import com.campday6.hrms.core.concretes.CheckEmailManager;
import com.campday6.hrms.core.concretes.CheckIdentityNumberManager;
import com.campday6.hrms.core.concretes.EmailVerificationManager;
import com.campday6.hrms.core.utilities.DataResult;
import com.campday6.hrms.core.utilities.ErrorDataResult;
import com.campday6.hrms.core.utilities.Result;
import com.campday6.hrms.core.utilities.SuccessDataResult;
import com.campday6.hrms.dataAccess.abstracts.JobTitleDao;
import com.campday6.hrms.entities.concretes.JobSeekers;
import com.campday6.hrms.entities.concretes.JobTitles;

public class JobTitlesManager implements JobTitlesService{


	private JobTitleDao jobTitleDao;

	@Autowired
	public JobTitlesManager(JobTitleDao jobTitleDao) {
		super();
		this.jobTitleDao = jobTitleDao;
	}

	
	@Override
	public DataResult<List<JobTitles>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobTitles>> getAllSorted() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobTitles>> getAll(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result add(JobTitles jobTitles) {
		return new SuccessDataResult<List<JobTitles>>
		((List<JobTitles>) this.jobTitleDao.save(jobTitles),"İş sisteme eklendi.");
	}

	@Override
	public DataResult<JobTitles> getByJobName(String jobName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<JobTitles> getByJobNameAndJobTitleId(String jobName, int jobTitleyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobTitles>> getByJobNameOrJobTitleId(String jobName, int jobTitleyId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobTitles>> getByJobNameContains(String jobName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobTitles>> getByJobNameStartsWith(String jobName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<JobTitles>> getByNameAndId(String jobName, int jobTitleId) {
		// TODO Auto-generated method stub
		return null;
	}

	
}