package com.xworkz.passport;

import com.xworkz.passport.dao.PassportDao;
import com.xworkz.passport.dto.PassportDto;

public class PassportRunner {

    public static void main(String[] args) {
        System.out.println("Account is Created");

        PassportDto dto = new PassportDto();
        dto.ca="GUBUXA";
        dto.cPs="Abhi123";
        dto.gN="Abhi";
        dto.em="abhi121@gmail.com";
        dto.ised=false;
        dto.sl=3;
        dto.cpvLoc="PO";
        dto.db="09/98/09";
        dto.hA="bangalore";
        dto.hQ="birth city";
        dto.ld="UHUJ12";
        dto.ps="Abhi123";
        dto.sN="S N";


        PassportDao passportDao = new PassportDao();

        passportDao.createPassport(dto);

        passportDao.getPassportDetails();




    }
}
