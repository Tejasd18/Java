package com.xworkz.amusementpark;

import com.xworkz.amusementpark.dao.AmusementParkDao;
import com.xworkz.amusementpark.dto.AmusementParkDto;

public class AmusementParkRunner {

    public static void main(String[] args) {

        AmusementParkDto dto = new AmusementParkDto();
        dto.id=1;
        dto.name="Wonderla";
        dto.noOfGames=50;
        dto.place="Bangalore";


        AmusementParkDao amusementParkDao = new AmusementParkDao();
        amusementParkDao.createPark(dto);
        amusementParkDao.getParkDetails();


    }


}
