package com.xworkz.passport.dao;


import com.xworkz.passport.dto.PassportDto;

public class PassportDao {

    PassportDto dto;

    public boolean createPassport(PassportDto dto){
        System.out.println("Create Passport is Created");
        boolean isPassportCreated=false;
        if(null!=dto){
            this.dto=dto;
            isPassportCreated=true;
        }else {
            System.out.println("Please Provide a valid Sur Name");
        }

        System.out.println("Create Passport is ended");
        return isPassportCreated;
    }

    public void getPassportDetails(){

        System.out.println("The Cpv Loc is "+dto.cpvLoc);
        System.out.println("Select the Location "+dto.sl);
        System.out.println("The Name is "+dto.gN);
        System.out.println("The surName is "+dto.sN);
        System.out.println("date of birth is "+dto.db);
        System.out.println("The Email is "+dto.em);
        System.out.println("Is the Email Id is same "+dto.ised);
        System.out.println("The login Id is "+dto.ld);
        System.out.println("The Password is "+dto.ps);
        System.out.println("The Conformation password is "+dto.cPs);
        System.out.println("Hint Question "+dto.hQ);
        System.out.println("Hint Answer "+dto.hA);
        System.out.println("captcha is "+dto.ca);


    }

}
