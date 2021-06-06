package com.campday6.hrms.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.campday6.hrms.business.abstracts.EmployerService;
import com.campday6.hrms.core.utilities.Result;
import com.campday6.hrms.entities.concretes.Employers;

import java.util.List;




@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	private EmployerService employerService;

	@Autowired
	public EmployerController(EmployerService employerService) {
		super();
		this.employerService = employerService;
}
		
		
@PostMapping("/add")
public Result add(@RequestBody Employers employers) {
	return this.employerService.add(employers);
}


}