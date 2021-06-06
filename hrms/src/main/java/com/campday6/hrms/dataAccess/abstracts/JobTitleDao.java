package com.campday6.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.campday6.hrms.entities.concretes.JobTitles;

public interface JobTitleDao  extends JpaRepository<JobTitles, Integer> {
	
	JobTitles getByJobName(String jobName);
	 
	JobTitles getByJobNameAndJobTitleId(String jobName, int jobTitleId);
	  
	  List<JobTitles> getByJobNameOrJobTitleId(String jobName, int jobTitleId);
	  
	  List<JobTitles> getByJobNameContains(String jobName);
	  
	  List<JobTitles> getByJobNameStartsWith(String jobName);
	  
	  @Query("From JobTitles where jobName=:jobName and jobTitleId=:jobTitleId")
	  List<JobTitles> getByNameAndId(String jobName, int jobTitleId);
	  
}