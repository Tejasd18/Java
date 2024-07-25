package com.xworkz.agarbathi;

import com.xworkz.agarbathi.dao.AgarbathiDao;
import com.xworkz.agarbathi.dto.AgarbathiDto;

public class AgarbathiRunner {

    public static void main(String[] args) {

        AgarbathiDto dto = new AgarbathiDto();
        dto.brandName="Cycle";
        dto.expDate="01/01/2025";
        dto.id=1;
        dto.qty=20;
        dto.mgfDate="01/01/2023";
        dto.fragrance="Sandalwood";
        dto.price=10.00;


        AgarbathiDao agarbathiDao = new AgarbathiDao();
        agarbathiDao.createAgarbathi(dto);
        agarbathiDao.getAgarbathiDetails();


    }

}
