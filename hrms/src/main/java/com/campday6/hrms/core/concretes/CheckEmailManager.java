package com.campday6.hrms.core.concretes;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.campday6.hrms.core.abstracts.CheckEmailService;




public class CheckEmailManager implements CheckEmailService {

	@Override
	 public boolean checkEmail(String email) {
        Pattern pattern = Pattern.compile("^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        boolean matchFound = matcher.find();
        if (!email.isEmpty() && matchFound) {
            return true;
        } else {
            throw new ArithmeticException("Bu e-posta geçerli değil.Başka e-posta deneyiniz");
        }

	
	
}
	}