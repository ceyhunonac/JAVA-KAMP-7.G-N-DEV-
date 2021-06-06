package com.campday6.hrms.business.abstracts;



import java.util.List;

import com.campday6.hrms.core.utilities.DataResult;
import com.campday6.hrms.core.utilities.Result;
import com.campday6.hrms.entities.concretes.JobSeekers;

public interface JobSeekerService {
	
	DataResult<List<JobSeekers>> getAll();
    DataResult<List<JobSeekers>> getAllSorted();
    DataResult<List<JobSeekers>> getAll(int pageNo, int pageSize);
    Result add(JobSeekers jobSeekers);
   
    DataResult<JobSeekers> getByFirstName(String firstName);
	  
    DataResult<JobSeekers> getByFirstNameAndLastName(String firstName, String lastName);
	  
    DataResult<List<JobSeekers>> getByFirstNameOrLastName(String firstName, String lastName);
	    
    DataResult<List<JobSeekers>> getByFirstNameContains(String firstName);
	  
    DataResult<List<JobSeekers>> getByFirstNameStartsWith(String firstName);

    DataResult<List<JobSeekers>> getByFNameAndLName(String firstName, String lastName);
}
