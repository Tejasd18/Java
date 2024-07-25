package com.xworkz.garden.dao;

import com.xworkz.garden.dto.GardenDto;

public class GardenDao {

    GardenDto dto;

    public boolean createGarden(GardenDto dto){
        boolean isGardenCreated=false;

        if (dto!=null){
            this.dto=dto;
            isGardenCreated=true;
        }else {
            System.out.println("Please Provide a Valid Name ");
        }
        return isGardenCreated;
    }

    public void getGardenDetails() {
        System.out.println("******************************************");
        System.out.println("Garden Name: " + dto.name);
        System.out.println("Location: " + dto.location);
        System.out.println("Size (in acres): " + dto.sizeInAcres);
        System.out.println("Id is " +dto.id);
        System.out.println("******************************************");
    }
}
