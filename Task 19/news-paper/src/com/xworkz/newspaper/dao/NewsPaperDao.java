package com.xworkz.newspaper.dao;

import com.xworkz.newspaper.dto.NewsPaperDto;

public class NewsPaperDao {

    NewsPaperDto dto;

    public boolean createNewsPaper(NewsPaperDto dto){
        System.out.println("Create News Paper is Created");
       boolean isNewsPaperCreated=false;
       boolean isnameValid=false;
       boolean isnoOfPagesValid=false;
       boolean iscirculationValid=false;
       boolean islanguageValid=false;
       boolean ispriceValid=false;
       boolean isIdValid=false;
        if(null!=dto){
            if (dto.name!=null){
                isnameValid=true;
            }else System.out.println("Please Enter a Valid Name");
            if (dto.noOfPages>0){
                isnoOfPagesValid=true;
            }else System.out.println("Please Enter a Valid No of pages");
            if (dto.circulation>0){
                iscirculationValid=true;
            }else System.out.println("Please Enter a Valid Circulation");
            if (dto.id>0){
                isIdValid=true;
            }else System.out.println("Please Enter a Valid Id");
            if (dto.language!=null){
                islanguageValid=true;
            }else System.out.println("Please Enter a Valid Language");
            if (dto.price>0){
                ispriceValid=true;
            }else System.out.println("Please Enter a Valid Price");
            if (iscirculationValid==true && isIdValid==true && islanguageValid==true && isnameValid==true
            && ispriceValid==true && isnoOfPagesValid==true){
                isNewsPaperCreated=true;
                this.dto=dto;
            }else System.out.println("Entered Data is Invalid");
        }else {
            System.out.println("Please Enter a valid Name");
        }
        System.out.println("Create News Paper is Ended");
        return isNewsPaperCreated;
    }


    public void getNewsPaperDetails() {
        System.out.println("The Newspaper Name is :"+dto.name);
        System.out.println("Number Of Pages :"+dto.noOfPages);
        System.out.println("Circulation :"+dto.circulation);
        System.out.println("Language : "+dto.language);
        System.out.println("Price is :"+dto.price);
        System.out.println("Id is :"+dto.id);
    }
}
