package com.campday6.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.campday6.hrms.entities.concretes.Users;

public interface UserDao extends JpaRepository<Users,Integer>{
	
	Users getByUserId(int userId);
	  
	  Users getByUserEmailAndUserId(String email, int userId);
	  
	  List<Users> getByUserEmailOrUserId(String email, int userId); 
	  
	  
	  List<Users> getByUserIdContains(int userId);
	  
	  List<Users> UserId(String UserDao);
	  
	  @Query("From Users where email=:email and userId=:userId")
	  List<Users> getByEmailAndId(String email, int userId);
    

}