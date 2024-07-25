package com.xworkz.homestay.dao;

import com.xworkz.homestay.dto.HomeStayDto;

public class HomeStayDao {

    HomeStayDto dto;

    public boolean createHomeStay(HomeStayDto dto){
       boolean isHomeStayCreated=false;
        if (dto!=null) {
            this.dto = dto;
            isHomeStayCreated = true;
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
