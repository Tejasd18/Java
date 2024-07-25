package com.xworkz.atmmachine;

import com.xworkz.atmmachine.dao.AtmMachineDao;
import com.xworkz.atmmachine.dto.AtmMachineDto;

public class AtmMachineRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        AtmMachineDto dto=new AtmMachineDto();
        dto.accountNo=632545978412l;
        dto.id=1;
        dto.pin=2024;
        dto.userName="valentino";

        AtmMachineDao atmMachineDao = new AtmMachineDao();
        atmMachineDao.createAtmMachine(dto);
        atmMachineDao.getAtmMachineDetails();

        System.out.println("Main Ended");
    }



}
