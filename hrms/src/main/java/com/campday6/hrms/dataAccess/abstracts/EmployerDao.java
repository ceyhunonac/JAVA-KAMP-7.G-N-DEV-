package com.campday6.hrms.dataAccess.abstracts;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.campday6.hrms.entities.concretes.Employers;

public interface EmployerDao extends JpaRepository<Employers, Integer> {
	
	 Employers getByEmployersCompanyName(String companyName);
	  
	  List<Employers> getByCompanyNameContains(String companyName);
	  
	 Employers getByCompanyNameAndPhone(String companyName, String phone);
	  
	  List< Employers> getByCompanyNameOrPhone(String companyName, String phone);
	  
	  List<Employers> getByCompanyNameStartsWith(String companyName);
	  
	  @Query("From Employers where companyName=:companyName and phone=:phone")
	  List< Employers> getByCNameAndPhone(String companyName, String phone);


}