package com.campday6.hrms.api;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.campday6.hrms.business.abstracts.JobTitlesService;
import com.campday6.hrms.core.utilities.DataResult;
import com.campday6.hrms.core.utilities.Result;
import com.campday6.hrms.entities.concretes.JobTitles;




@RestController
@RequestMapping("/job/positions")
public class JobTitleController {
	

	
	private JobTitlesService jobTitlesService;
	
	
	@Autowired
	public JobTitleController(JobTitlesService jobTitlesService) {
		super();
		this.jobTitlesService = jobTitlesService;
	}


	@GetMapping("/getall")
	public DataResult<List<JobTitles>> getAll(){
		return this.jobTitlesService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody JobTitles jobTitles) {
		return this.jobTitlesService.add(jobTitles);
	}
	
	@GetMapping("/getByJobName")
	public DataResult<JobTitles> getByProductName(@RequestParam String jobName){
		return this.jobTitlesService.getByJobName(jobName);
	}
	
	@GetMapping("/getByJobNameAndJobTitleId")
	public DataResult<JobTitles> 
	getByJobNameAndJobTitleId(@RequestParam("jobName") String jobName,@RequestParam("jobTitleId") int jobTitleId){
		System.out.println(jobName);
		System.out.println(jobTitleId);
		
		return this.jobTitlesService.getByJobNameAndJobTitleId(jobName, jobTitleId);
	}
	
	@GetMapping("/getByJobNameContains")
	public DataResult<List<JobTitles>> getByJobNameContains(@RequestParam String jobName){
		return this.jobTitlesService.getByJobNameContains(jobName);
	}
	
	@GetMapping("/getAllByPage")
	DataResult<List<JobTitles>> getAll(int pageNo, int pageSize){
		return this.jobTitlesService.getAll(pageNo, pageSize);
	}
	
	@GetMapping("/getAllDesc")
	public DataResult<List<JobTitles>> getAllSorted() {
		return this.jobTitlesService.getAllSorted();
	}
}