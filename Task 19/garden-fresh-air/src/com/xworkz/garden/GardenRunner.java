package com.xworkz.garden;

import com.xworkz.garden.dao.GardenDao;
import com.xworkz.garden.dto.GardenDto;

public class GardenRunner {

    public static void main(String[] args) {

        GardenDto dto = new GardenDto();
        dto.id=1;
        dto.location="Mavalli";
        dto.name="Lalbagh Botanical Garden";
        dto.sizeInAcres=240;


        GardenDao gardenDao = new GardenDao();
        gardenDao.createGarden(dto);
        gardenDao.getGardenDetails();


    }



}
