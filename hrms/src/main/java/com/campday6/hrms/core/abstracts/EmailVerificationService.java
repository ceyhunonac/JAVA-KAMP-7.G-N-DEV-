package com.campday6.hrms.core.abstracts;

import com.campday6.hrms.entities.concretes.Users;

public interface EmailVerificationService {
    void verificationEmail(Users users);
    boolean isEmailVerified(Users users);

}