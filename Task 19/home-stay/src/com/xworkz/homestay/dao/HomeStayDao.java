package com.xworkz.homestay.dao;

import com.xworkz.homestay.dto.HomeStayDto;

public class HomeStayDao {

    HomeStayDto dto;

    public boolean createHomeStay(HomeStayDto dto){
       boolean isHomeStayCreated=false;
       boolean isareaInSftValid=false;
       boolean ispropertyNameValid=false;
       boolean isownerNameValid=false;
       boolean isnoOfRoomsValid=false;
       boolean isIdValid=false;
        if (dto!=null) {
            if (dto.areaInSft>0){
                isareaInSftValid=true;
            }else System.out.println("Please Enter a Valid Area Of Sqt");
            if (dto.propertyName!=null){
                ispropertyNameValid=true;
            }else System.out.println("Please Enter a Valid Property name");
            if (dto.ownerName!=null){
                isownerNameValid=true;
            }else System.out.println("Please Enter a Valid Owner Name");
            if (dto.id>0){
                isIdValid=true;
            }else System.out.println("Please Enter a Valid Id");
            if (dto.noOfRooms>0){
                isnoOfRoomsValid=true;
            }else System.out.println("Please Enter a Valid No of Rooms");
            if (isareaInSftValid==true && isIdValid==true && isownerNameValid==true && ispropertyNameValid==true && isnoOfRoomsValid==true){
                isHomeStayCreated=true;
                this.dto=dto;
            }else System.out.println("Entered Data is Invalid");
        }else {
            System.out.println("Please enter a Valid Property Name ");
        }
       return isHomeStayCreated;
    }

    public void getHomeStayDetails() {
        System.out.println("Property Name :"+dto.propertyName);
        System.out.println("Owner Name :"+dto.ownerName);
        System.out.println("Area in sq. ft :"+dto.areaInSft);
        System.out.println("Number of Rooms :"+dto.noOfRooms);
        System.out.println("Id is :"+dto.id);
    }
}
