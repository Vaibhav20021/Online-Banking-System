package com.vaibhav.BankingApplication.dto;

import jakarta.annotation.security.DenyAll;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreditDebitRequest {
    private String accountNumber;
    private BigDecimal amount;
}
