package com.xworkz.simcard.dao;

import com.xworkz.simcard.dto.SimCardDto;

public class SimCardDao {

    SimCardDto dto;

    public boolean createSimCard(SimCardDto dto){
        boolean isSimCardCreated=false;
        boolean isPriceValid=false;
        boolean isNameValid=false;
        boolean isPlanValid=false;
        boolean isSimCardIdValid=false;
        if (dto!=null){
            if (dto.name!=null){
                isPlanValid=true;
            }else System.out.println("Please Enter a Valid Plan");
            if (dto.price>0){
                isPriceValid=true;
            }else System.out.println("Please Enter a Valid Price");
            if (dto.name!=null){
                isNameValid=true;
            }else System.out.println("Please Enter a Valid Name");
            if (dto.id>0){
                isSimCardIdValid=true;
            }else System.out.println("Please Enter a Valid Id");
            if (isSimCardIdValid==true && isNameValid==true && isPlanValid==true && isPriceValid==true){
                isSimCardCreated=true;
                this.dto=dto;
            }else System.out.println("Entered Data is Invalid");
        }else {
            System.out.println("Please Enter a Valid Name");
        }
        return isSimCardCreated;
    }


    public void getSimCardDetails() {
        System.out.println("********************************");
        System.out.println("Name of Sim Card: " + dto.name);
        System.out.println("Plan: " + dto.plan);
        System.out.println("Price: " + dto.price);
        System.out.println("Id is " + dto.id);
        System.out.println("********************************");
    }
}
