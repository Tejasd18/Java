package com.xworkz.battery;

import com.xworkz.battery.dao.BatteryDao;
import com.xworkz.battery.dto.BatteryDto;

public class BatteryRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        BatteryDto dto = new BatteryDto();
        dto.brandName="Duracell";
        dto.id=1;
        dto.capacity=2000;
        dto.type="AA";
        dto.price=2.50;
        dto.rechargeable=false;
        dto.voltage=1.5;

        BatteryDao batteryDao = new BatteryDao();

        batteryDao.createBatteryDetails(dto);

        batteryDao.getBatteryDetails();

        System.out.println("Main Ended");
    }

}
