package com.xworkz.homestay;

import com.xworkz.homestay.dao.HomeStayDao;
import com.xworkz.homestay.dto.HomeStayDto;

public class HomeStayRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        HomeStayDto dto = new HomeStayDto();
        dto.areaInSft=5000;
        dto.id=1;
        dto.noOfRooms=150;
        dto.ownerName="Tata Group";
        dto.propertyName="Taj Exotica";

        HomeStayDao homeStayDao = new HomeStayDao();

        homeStayDao.createHomeStay(dto);
        homeStayDao.getHomeStayDetails();

        System.out.println("Main Ended");

    }



}
