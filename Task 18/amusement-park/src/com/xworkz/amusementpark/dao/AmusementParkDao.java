package com.xworkz.amusementpark.dao;

import com.xworkz.amusementpark.dto.AmusementParkDto;

public class AmusementParkDao {

    AmusementParkDto dto;

    public boolean createPark(AmusementParkDto dto){
        boolean isParkCreated=false;

        if(dto!=null){
            this.dto=dto;
            isParkCreated=true;
        }else {
            System.out.println("Please Provide a valid Place");
        }
        return isParkCreated;
    }


    public void getParkDetails() {
        System.out.println("********************************");
        System.out.println("Park Name: " + dto.name);
        System.out.println("Location: " + dto.place);
        System.out.println("Number of Games: " + dto.noOfGames);
        System.out.println("Id is " + dto.id);
        System.out.println("********************************");
    }
}
