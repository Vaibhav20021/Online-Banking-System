package com.vaibhav.BankingApplication.utils;


//Generation of account number
import java.security.PublicKey;
import java.time.Year;

public class AccountUtils{

    public static final String ACCOUNT_EXISTS_CODE="001";
    public static final String ACCOUNT_EXISTS_MESSAGE="This user already has an account Created!";
    public static final String ACCOUNT_CREATION_SUCCESS="002";
    public static final String ACCOUNT_CREATION_MESSAGE="Account has been successfully created!";
    public static final String ACCOUNT_NOT_EXIST_CODE="003";
    public static final String ACCOUNT_NOT_EXIST_MESSAGE="User with the provided Account Number does not exist";
    public static final String ACCOUNT_FOUND_CODE="004";
    public static final String ACCOUNT_FOUND_SUCCESS="User with the provided Account Number is exist.";
    public static final String ACCOUNT_CREDITED_SUCCESS="005";
    public static final String ACCOUNT_CREDITED_SUCCESS_MESSAGE="User account credited successfully";
    public static final String INSUFFICIENT_BALANCE_CODE="006";
    public static final String INSUFFICIENT_BALANCE_MESSAGE="Insufficient Balance";
    public static final String ACCOUNT_DEBITED_SUCCESS="007";
    public static final String ACCOUNT_DEBITED_SUCCESS_MESSAGE="Account has been debited successfully";
    public static final String TRANSFER_SUCCESSFUL_CODE="008";
    public static final String TRANSFER_SUCCESSFUL_MESSAGE="Transaction Successful";
    public static String generateAccountNumber(){
        /**
         * 2023 + randomSixDigits
         * 202311223344
         */
        Year currentYear=Year.now();
        int min=100000;
        int max=999999;

        //Generate a random number between min and max
        int randNumber=(int) Math.floor(Math.random() * (max-min+1)+min);
        //Convert the current and randomNumber to strings, then concatenate them
        String year=String.valueOf(currentYear);
        String randomNumber=String.valueOf(randNumber);
        StringBuilder accountNumber=new StringBuilder();

        return accountNumber.append(year).append(randomNumber).toString();
    }
}
