package com.campday6.hrms.business.abstracts;

import java.util.List;

import com.campday6.hrms.core.utilities.DataResult;
import com.campday6.hrms.core.utilities.Result;
import com.campday6.hrms.entities.concretes.JobTitles;


public interface JobTitlesService {
	
	DataResult<List<JobTitles>> getAll();
    DataResult<List<JobTitles>> getAllSorted();
    DataResult<List<JobTitles>> getAll(int pageNo, int pageSize);
    Result add(JobTitles jobTitles);
   
    DataResult<JobTitles>  getByJobName(String jobName);
	  
    DataResult<JobTitles> getByJobNameAndJobTitleId(String jobName, int jobTitleId);
	  
    DataResult<List<JobTitles>> getByJobNameOrJobTitleId(String jobName, int jobTitleId);
	    
    DataResult<List<JobTitles>> getByJobNameContains(String jobName);
	  
    DataResult<List<JobTitles>> getByJobNameStartsWith(String jobName);

    DataResult<List<JobTitles>> getByNameAndId(String jobName, int jobTitleId);
	
}