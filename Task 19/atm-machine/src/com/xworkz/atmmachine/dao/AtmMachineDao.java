package com.xworkz.atmmachine.dao;

import com.xworkz.atmmachine.dto.AtmMachineDto;

public class AtmMachineDao {

    AtmMachineDto dto ;

    public boolean createAtmMachine(AtmMachineDto dto){
        boolean isAtmMachineCreated = false;
        boolean isUserNameValid=false;
        boolean isAccountNoValid=false;
        boolean isPinValid=false;
        boolean isAtmIdValid=false;
        if (dto!=null){
            if (dto.userName!=null){
                isUserNameValid=true;
            }else System.out.println("Please Enter a Valid User Name");
            if (dto.accountNo>0){
                isAccountNoValid=true;
            }else System.out.println("Please Enter a Valid Account No");
            if (dto.pin>0){
                isPinValid=true;
            }else System.out.println("Please Enter a Valid Pin");
            if (dto.id>0){
                isAtmIdValid=true;
            }else System.out.println("Please Enter a Valid Id");
            if (isAtmIdValid==true && isAccountNoValid==true && isPinValid==true && isUserNameValid==true){
                isAtmMachineCreated=true;
                this.dto=dto;
            }else System.out.println("Entered Data is Invalid");
        }else {
            System.out.println("Please Enter a Valid Account Number ");
        }
        return isAtmMachineCreated;
    }

    public void getAtmMachineDetails() {
        System.out.println("********************************");
        System.out.println("User Name: " + dto.userName);
        System.out.println("Account No: " + dto.accountNo);
        System.out.println("Pin: " + dto.pin);
        System.out.println("Id is " + dto.id);
        System.out.println("********************************");
    }
}
