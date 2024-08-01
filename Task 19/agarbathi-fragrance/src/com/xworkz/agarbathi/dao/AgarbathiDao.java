package com.xworkz.agarbathi.dao;

import com.xworkz.agarbathi.dto.AgarbathiDto;

public class AgarbathiDao {

    AgarbathiDto dto;

    public boolean createAgarbathi(AgarbathiDto dto){
        boolean isAgarbathiCreated=false;
        boolean isbrandNameValid=false;
        boolean isqtyValid=false;
        boolean isfragranceValid=false;
        boolean ispriceValid=false;
        boolean ismgfDateValid=false;
        boolean isexpDateValid=false;
        boolean isidValid=false;
        if (dto!=null){
            if (dto.brandName!=null){
                isbrandNameValid=true;
            }else System.out.println("Please Enter a Valid Brand Name ");
            if (dto.qty>0){
                isqtyValid=true;
            }else System.out.println("Please Enter a Valid Quantity");
            if (dto.fragrance!=null){
                isfragranceValid=true;
            }else System.out.println("Please Enter a Valid Fragrance");
            if (dto.price>0.0){
                ispriceValid=true;
            }else System.out.println("Please Provide a Price");
            if (dto.expDate!=null){
                isexpDateValid=true;
            }else System.out.println("Please Enter a Expiry Date");
            if (dto.mgfDate!=null){
                ismgfDateValid=true;
            }else System.out.println("Please Enter a Mgf Date");
            if (dto.id>0){
                isidValid=true;
            }else System.out.println("Please Enter a Valid Id ");
            if (isbrandNameValid==true && isqtyValid==true && isfragranceValid==true && ispriceValid==true &&
            isexpDateValid==true && ismgfDateValid==true && isidValid==true){
                this.dto=dto;
                isAgarbathiCreated=true;
            }else System.out.println("The Entered Data is Invalid");
        }else {
            System.out.println("The Entered Data is Not Found");
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
