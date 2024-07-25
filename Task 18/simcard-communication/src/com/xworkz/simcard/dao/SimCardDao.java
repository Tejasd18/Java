package com.xworkz.simcard.dao;

import com.xworkz.simcard.dto.SimCardDto;

public class SimCardDao {

    SimCardDto dto;


    public boolean createSimCard(SimCardDto dto){
        boolean isSimCardCreated=false;

        if (dto!=null){
            this.dto=dto;
            isSimCardCreated=true;
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
