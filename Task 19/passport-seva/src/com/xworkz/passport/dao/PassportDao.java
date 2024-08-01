package com.xworkz.passport.dao;


import com.xworkz.passport.dto.PassportDto;

public class PassportDao {

    PassportDto dto;

    public boolean createPassport(PassportDto dto){
        System.out.println("Create Passport is Created");
        boolean isPassportCreated=false;
        boolean isisedValid=false;
        boolean iscpvLocValid=false;
        boolean issNValid=false;
        boolean isslValid=false;
        boolean isgNValid=false;
        boolean isdbValid=false;
        boolean isemValid=false;
        boolean isldValid=false;
        boolean ispsValid=false;
        boolean iscPsValid=false;
        boolean ishQValid=false;
        boolean ishAValid=false;
        boolean iscaValid=false;
        if(dto!=null){
            if (dto.ised!=false){
                isisedValid=true;
            }else System.out.println("Please Provide a Valid IsEd");
            if (dto.cpvLoc!=null){
                iscPsValid=true;
            }else System.out.println("Please Provide a Valid CPV Location");
            if (dto.sN!=null){
                issNValid=true;
            }else System.out.println("Please Provide a Valid SN");
            if (dto.sl>0){
                isslValid=true;
            }else System.out.println("Please Enter a Valid SL");
            if (dto.gN!=null){
                isgNValid=true;
            }else System.out.println("Please Enter a Valid Gender Name");
            if (dto.db!=null){
                isdbValid=true;
            }else System.out.println("Please Enter a Valid Date of Birth");
            if (dto.em!=null){
                isemValid=true;
            }else System.out.println("Please Enter a Valid Email");
            if (dto.ld!=null){
                isldValid=true;
            }else System.out.println("Please Enter a Valid Ld");
            if (dto.ps!=null){
                ispsValid=true;
            }else System.out.println("Please Enter a Valid Password");
            if (dto.cPs!=null){
                iscPsValid=true;
            }else System.out.println("PLease Enter a Valid Confirm Password");
            if (dto.hQ!=null){
                ishQValid=true;
            }else System.out.println("Please Enter a Valid Hint Question");
            if (dto.hA!=null){
                ishAValid=true;
            }else System.out.println("Please Enter a Valid Hint Answer");
            if (dto.ca!=null){
                iscaValid=true;
            }else System.out.println("Please Enter a Valid CA");
            if(isisedValid==true && iscPsValid==true && issNValid==true && isslValid==true && isgNValid==true && isdbValid==true && isemValid==true && isldValid==true &&
              ispsValid==true && iscPsValid==true && ishQValid==true && ishAValid==true && iscaValid==true){
                this.dto=dto;
                isPassportCreated=true;
            }else System.out.println("Entered Data is InValid");
        }else {
            System.out.println("Entered Data is Not Found");
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
