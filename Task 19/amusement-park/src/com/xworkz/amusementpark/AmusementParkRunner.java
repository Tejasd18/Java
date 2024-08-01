package com.xworkz.amusementpark;

import com.xworkz.amusementpark.dao.AmusementParkDao;
import com.xworkz.amusementpark.dto.AmusementParkDto;

public class AmusementParkRunner {

    public static void main(String[] args) {

        AmusementParkDto amusementParkDto = new AmusementParkDto();
        amusementParkDto.id=1;
        amusementParkDto.name="Wonderla";
        amusementParkDto.noOfGames=50;
        amusementParkDto.place="Bangalore";


        AmusementParkDao amusementParkDao = new AmusementParkDao();
        amusementParkDao.createPark(amusementParkDto);
        amusementParkDao.getParkDetails();


    }


}
