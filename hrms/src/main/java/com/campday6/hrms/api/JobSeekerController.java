package com.campday6.hrms.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import org.springframework.web.bind.annotation.RequestParam;

import com.campday6.hrms.business.abstracts.JobSeekerService;

import com.campday6.hrms.core.utilities.DataResult;
import com.campday6.hrms.core.utilities.Result;
import com.campday6.hrms.entities.concretes.JobSeekers;


public class JobSeekerController {
	

	
	private JobSeekerService jobSeekerService;
	
	
	@Autowired
	public JobSeekerController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}


	@GetMapping("/getall")
	public DataResult<List<JobSeekers>> getAll(){
		return this.jobSeekerService.getAll();
	}
	
	@PostMapping("/add")
	public Result aadd(JobSeekers jobSeekers) {
		return this.jobSeekerService.add(jobSeekers);
	}
	
	@GetMapping("/getByJobName")
	public DataResult<JobSeekers> getByFirstName(@RequestParam String firstName){
		return this.jobSeekerService.getByFirstName(firstName);
	}
	
	@GetMapping("/getByFirstNameAndLastName")
	public DataResult<JobSeekers> 
	 getByFirstNameAndLastName(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName){
		System.out.println(firstName);
		System.out.println(lastName);
		
		return this.jobSeekerService.getByFirstNameAndLastName(firstName, lastName);
	}
	
	@GetMapping("/getByFirstNameContains")
	public DataResult<List<JobSeekers>> getByFirstNameContains(@RequestParam String firstName){
		return this.jobSeekerService.getByFirstNameContains(firstName);
	}
	
	@GetMapping("/getAllByPage")
	DataResult<List<JobSeekers>> getAll(int pageNo, int pageSize){
		return this.jobSeekerService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<JobSeekers>> getAllSorted() {
		return this.jobSeekerService.getAllSorted();
	}

}
