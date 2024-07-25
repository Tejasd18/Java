package com.xworkz.bankaccount.dao;

import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsDao {
        //dto is a non-premitive ref
    AccountDetailsDto dto;

    public boolean createAccount(AccountDetailsDto dto){
        System.out.println("Create Account is started");

        boolean isAccountCreated=false;

        if (null!=dto){
            this.dto=dto;
            isAccountCreated=true;
        }
        System.out.println("Create Account is ended");
        return isAccountCreated;
    }

    public void getAccountDetails() {

        System.out.println("Customer Id is: "+dto.customerId);
        System.out.println("Bank Name is: "+dto.bankName);
        System.out.println("Branch Name  is: "+dto.branchName);
        System.out.println("IFSC Code is: "+dto.ifscCode);
        System.out.println("Account number is: "+dto.accoutNumber);
        System.out.println("Address is: "+dto.address);


    }
}
