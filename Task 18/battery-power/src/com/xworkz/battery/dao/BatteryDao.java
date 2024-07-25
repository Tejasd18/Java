package com.xworkz.battery.dao;

import com.xworkz.battery.dto.BatteryDto;

public class BatteryDao {

    BatteryDto dto;

    public boolean createBatteryDetails(BatteryDto dto){
        boolean isBatteryDetailsCreated=false;

        if (dto!=null) {
            this.dto=dto;
            isBatteryDetailsCreated=true;
        }else {
            System.out.println("Please Enter a Valid Type of Battery");
        }
        return isBatteryDetailsCreated;
    }


    public void getBatteryDetails() {
        System.out.println("The Battery Brand is :"+dto.brandName);
        System.out.println("Id is :"+dto.id);
        System.out.println("The Capacity is :"+dto.capacity);
        System.out.println("Type is :"+dto.type);
        System.out.println("Price is :"+dto.price);
        System.out.println("Rechargeable :"+dto.rechargeable);
        System.out.println("Voltage is :"+dto.voltage);
    }
}
