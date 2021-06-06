package com.campday6.hrms.core.concretes;

import com.campday6.hrms.core.abstracts.EmailVerificationService;
import com.campday6.hrms.entities.concretes.Users;

public class EmailVerificationManager implements EmailVerificationService {

	 @Override
	    public void verificationEmail(Users users) {
	        System.out.println("E-postaya doğrulama linki gönderilmiştir.Linke tıklayıp doğrulama işlemini tamamlayınız");
	    }

	    @Override
	    public boolean isEmailVerified(Users users) {
	        System.out.println("E-posta adresi başarıyla doğrulanmıştır " );
	        return true;
	    }
	
	
}