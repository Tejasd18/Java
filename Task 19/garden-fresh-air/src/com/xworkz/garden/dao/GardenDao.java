package com.xworkz.garden.dao;

import com.xworkz.garden.dto.GardenDto;

public class GardenDao {

    GardenDto dto;

    public boolean createGarden(GardenDto dto){
        boolean isGardenCreated=false;
        boolean isGardenNameValid=false;
        boolean isGardenLocationValid=false;
        boolean isSizeOfAcresValid=false;
        boolean isGardenIdValid=false;
        if (dto!=null){
            if (dto.name!=null){
                isGardenNameValid=true;
            }else System.out.println("Please Enter a Valid Name");
            if (dto.location!=null){
                isGardenLocationValid=true;
            }else System.out.println("Please Enter a Valid Location");
            if (dto.sizeInAcres>0.0){
                isSizeOfAcresValid=true;
            }else System.out.println("Please Enter a Valid Size Of Acres");
            if (dto.id>0){
                isGardenIdValid=true;
            }else System.out.println("Please Enter a Valid Id");
            if (isGardenIdValid==true && isGardenLocationValid==true && isGardenNameValid==true && isSizeOfAcresValid==true){
                isGardenCreated=true;
                this.dto=dto;
            }else System.out.println("Entered Data is Invalid");
        }else {
            System.out.println("The Data provided is Not found ");
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
