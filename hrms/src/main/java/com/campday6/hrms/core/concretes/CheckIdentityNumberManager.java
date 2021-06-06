package com.campday6.hrms.core.concretes;

import com.campday6.hrms.core.abstracts.CheckIdentityNumberService;

public class CheckIdentityNumberManager implements CheckIdentityNumberService {

	
		@Override
	    public boolean checkTrNu(String trNu) {
	        if (trNu.length() == 11) {
	            return true;
	        } else {
	            throw new ArithmeticException("Kmlik Numarası uzunluğu 11 karakter  olmalıdır");
	           
	        }
	    }
	}

