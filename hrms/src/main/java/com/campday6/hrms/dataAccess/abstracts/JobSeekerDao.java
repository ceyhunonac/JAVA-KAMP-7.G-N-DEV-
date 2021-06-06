package com.campday6.hrms.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.campday6.hrms.entities.concretes.JobSeekers;


public interface JobSeekerDao  extends JpaRepository<JobSeekers, Integer> {

	 JobSeekers getByFirstName(String firstName);	  
	 
	JobSeekers getByFirstNameAndLastName(String firstName, String lastName);
	 
	 List<JobSeekers> getByFirstNameOrLastName(String firstName, String lastName);
	  
	  List<JobSeekers> getByFirstNameContains(String firstName);
	  
	  List<JobSeekers> getByFirstNameStartsWith(String firstName);
	  
	  @Query("From JobSeekerswhere firstName=:firstName and lastName=:lastName")
	  List<JobSeekers> getByFNameAndLName(String firstName, String lastName);
	  
	
}