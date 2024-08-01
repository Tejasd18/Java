package com.xworkz.battery.dao;

import com.xworkz.battery.dto.BatteryDto;

public class BatteryDao {

    BatteryDto dto;

    public boolean createBatteryDetails(BatteryDto dto){
        boolean isBatteryDetailsCreated=false;
        boolean isbrandNameValid=false;
        boolean istypeValid=false;
        boolean iscapacityValid=false;
        boolean isvoltageValid=false;
        boolean isrechargeableValid=false;
        boolean ispriceValid=false;
        boolean isIdValid=false;
        if (dto!=null) {
            if (dto.brandName!=null){
                isbrandNameValid=true;
            }else System.out.println("Please Enter a Valid Name");
            if (dto.type!=null){
                istypeValid=true;
            }else System.out.println("Please Enter a Valid Type");
            if (dto.capacity>0.0){
                iscapacityValid=true;
            }else System.out.println("Please Enter a Valid Capacity");
            if (dto.id>0){
                isIdValid=true;
            }else System.out.println("Please Enter a Valid Id");
            if (dto.voltage>0.0){
                isvoltageValid=true;
            }else System.out.println("Please Enter a Valid Voltage Value");
            if (dto.rechargeable!=false){
                isrechargeableValid=true;
            }else System.out.println("Please Enter a Valid Rechareable Value");
            if (dto.price>0){
                ispriceValid=true;
            }else System.out.println("Please Enter a Valid Price");
            if (isrechargeableValid==true && iscapacityValid==true && ispriceValid==true && isIdValid==true
            && isbrandNameValid==true && istypeValid==true && isvoltageValid==true){
                isBatteryDetailsCreated=true;
                this.dto=dto;
            }else System.out.println("Entered Data is Invalid");
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
