package com.vaibhav.BankingApplication.service.impl;

import com.vaibhav.BankingApplication.dto.EmailDetails;

public interface EmailService {
    void sendEmailAlerts(EmailDetails emailDetails);
    
}
