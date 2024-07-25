package com.xworkz.atmmachine.dao;

import com.xworkz.atmmachine.dto.AtmMachineDto;

public class AtmMachineDao {

    AtmMachineDto dto ;

    public boolean createAtmMachine(AtmMachineDto dto){
        boolean isAtmMachineCreated = false;

        if (dto!=null){
            this.dto=dto;
            isAtmMachineCreated=true;
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
