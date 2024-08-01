package com.xworkz.amusementpark.dao;

import com.xworkz.amusementpark.dto.AmusementParkDto;

public class AmusementParkDao {

    AmusementParkDto dto;

    public boolean createPark(AmusementParkDto dto){
        boolean isParkCreated=false;
        boolean isParkPlaceValid=false;
        boolean isParkNameValid=false;
        boolean isParkIdValid=false;
        boolean isNoOfGamesValid=false;
        if(dto!=null){
            if(dto.place!=null){
                isParkPlaceValid=true;
            }
            else {
                System.out.println("Please Enter a Valid Place of the Park");
            }
            if (dto.name!=null){
                isParkNameValid=true;
            }else {
                System.out.println("Please Enter a Valid Park Name");
            }
            if (dto.id>0){
                isParkIdValid=true;
            }else {
                System.out.println("Please Enter a Valid Park Id");
            }
            if (dto.noOfGames>0){
                isNoOfGamesValid=true;
            }else {
                System.out.println("Please Enter a Valid No of Games");
            }
            if (isParkIdValid==true && isParkNameValid==true && isNoOfGamesValid==true && isParkPlaceValid==true){
                this.dto=dto;
                isParkCreated=true;
            }else {
                System.out.println("The Data Entered is InValid");
            }
        }else {
            System.out.println("The data Entered is Not found");
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
