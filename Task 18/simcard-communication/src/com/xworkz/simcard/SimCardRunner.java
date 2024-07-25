package com.xworkz.simcard;

import com.xworkz.simcard.dao.SimCardDao;
import com.xworkz.simcard.dto.SimCardDto;

public class SimCardRunner {

    public static void main(String[] args) {

        SimCardDto dto = new SimCardDto();
        dto.id=1;
        dto.name="jio";
        dto.plan="Unlimited Data";
        dto.price=666.00;


        SimCardDao simCardDao = new SimCardDao();
        simCardDao.createSimCard(dto);
        simCardDao.getSimCardDetails();

    }
}
