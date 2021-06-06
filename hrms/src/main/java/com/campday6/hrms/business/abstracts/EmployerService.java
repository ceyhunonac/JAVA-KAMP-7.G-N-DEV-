package com.campday6.hrms.business.abstracts;

import java.util.List;

import com.campday6.hrms.core.utilities.DataResult;
import com.campday6.hrms.core.utilities.Result;
import com.campday6.hrms.entities.concretes.Employers;


public interface EmployerService {
	
	DataResult<List<Employers>> getAll();
    DataResult<List<Employers>> getAllSorted();
    DataResult<List<Employers>> getAll(int pageNo, int pageSize);
    Result add(Employers employers);
   
    DataResult<Employers> getByEmployersCompanyName(String companyName);
	  
    DataResult<Employers>getByCompanyNameAndPhone(String companyName, String phone);
	  
    DataResult<List<Employers>> getByCompanyNameOrPhone(String companyName, String phone);
	    
    DataResult<List<Employers>> getByCompanyNameContains(String companyName);
	  
    DataResult<List<Employers>> getByCompanyNameStartsWith(String companyName);

    DataResult<List<Employers>> getByCNameAndPhone(String companyName, String phone);
}
