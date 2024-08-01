package com.xworkz.bankaccount;

import com.xworkz.bankaccount.dao.AccountDetailsDao;
import com.xworkz.bankaccount.dto.AccountDetailsDto;

public class AccountDetailsRunner {

    public static void main(String[] args) {
        System.out.println("Main is Started");

        AccountDetailsDto dto = new AccountDetailsDto();
        dto.accoutNumber=123456454515l;
        dto.address="Mysore Bank";
        dto.bankName="sbi";
        dto.branchName="Avenue Road";
        dto.customerId=1;
        dto.ifscCode="345ACZ";

        AccountDetailsDao accountDetailsDao = new AccountDetailsDao();
        accountDetailsDao.createAccount(dto);
        accountDetailsDao.getAccountDetails();

        System.out.println("Main is Ended");

    }

}
