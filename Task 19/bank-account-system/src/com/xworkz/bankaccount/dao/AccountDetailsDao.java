package com.xworkz.bankaccount.dao;

import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsDao {
        //dto is a non-premitive ref
    AccountDetailsDto dto;

    public boolean createAccount(AccountDetailsDto dto){
        System.out.println("Create Account is started");
        boolean isAccountCreated=false;
        boolean iscustomerIdValid=false;
        boolean isbankNameValid=false;
        boolean isbranchNameValid=false;
        boolean isifscCodeValid=false;
        boolean isaccoutNumberValid=false;
        boolean isaddressValid=false;
        if (null!=dto){
            if (dto.customerId>0){
                iscustomerIdValid=true;
            }else System.out.println("Please Enter a Valid Customer Id");
            if (dto.bankName!=null){
                isbankNameValid=true;
            }else System.out.println("Please Enter a Valid Bank Name");
            if (dto.branchName!=null){
                isbranchNameValid=true;
            }else System.out.println("Please Enter a Valid Branch Name");
            if (dto.ifscCode!=null){
                isifscCodeValid=true;
            }else System.out.println("Please Enter a Valid IFSC Code");
            if (dto.accoutNumber>0){
                isaccoutNumberValid=true;
            }else System.out.println("Please Enter a Valid Account Number");
            if (dto.address!=null){
                isaddressValid=true;
            }else System.out.println("Please Enter a Valid Address");
            if (isaddressValid==true && isaccoutNumberValid==true && iscustomerIdValid==true &&
            isbankNameValid==true && isifscCodeValid==true  && isbranchNameValid==true){
                isAccountCreated=true;
                this.dto=dto;
            }else System.out.println("Entered Data is InValid");
        }
        else System.out.println("Entered data is Not Found");
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
