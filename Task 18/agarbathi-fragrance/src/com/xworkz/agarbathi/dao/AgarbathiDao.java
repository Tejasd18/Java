package com.xworkz.agarbathi.dao;

import com.xworkz.agarbathi.dto.AgarbathiDto;

public class AgarbathiDao {

    AgarbathiDto dto;

    public boolean createAgarbathi(AgarbathiDto dto){
        boolean isAgarbathiCreated=false;

        if (dto!=null){
            this.dto=dto;
            isAgarbathiCreated=true;
        }else {
            System.out.println("Please Provide a Valid Fragrance");
        }
        return isAgarbathiCreated;
    }


    public void getAgarbathiDetails() {
        System.out.println("*********************************************");
        System.out.println("The Brand Name is: " + dto.brandName);
        System.out.println("The quantity is: " + dto.qty);
        System.out.println("The Fragrance is: " + dto.fragrance);
        System.out.println("The Price is: " + dto.price);
        System.out.println("The manufactured date is: " + dto.mgfDate);
        System.out.println("The expiring date is: " + dto.expDate);
        System.out.println("Id is " +dto.id);
        System.out.println("*********************************************");
    }
}
