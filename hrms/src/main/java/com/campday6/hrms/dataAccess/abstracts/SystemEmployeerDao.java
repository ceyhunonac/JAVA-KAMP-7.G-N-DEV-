package com.campday6.hrms.dataAccess.abstracts;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.campday6.hrms.entities.concretes.SystemEmployees;

public interface  SystemEmployeerDao extends JpaRepository<SystemEmployees, Integer> {
	
     SystemEmployees getBySystemEmployeesName(String userName);
	  
     SystemEmployees SystemEmployeesNameAndEmail(String userName, String email);
	  
	  List<SystemEmployees> getBySystemEmployeesNameOrEmail(String userName, String email);
	  
	  List<SystemEmployees> getBySystemEmployeesNameContains(String userName);
	  
	  List<SystemEmployees> getBySystemEmployeesNameStartsWith(String userName);
	  
	  @Query("From SystemEmployees where userName=:userName and email=:email")
	  List<SystemEmployees> getByNameAndEmail(String userName, String email);

}