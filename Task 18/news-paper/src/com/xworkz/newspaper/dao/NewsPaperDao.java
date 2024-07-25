package com.xworkz.newspaper.dao;

import com.xworkz.newspaper.dto.NewsPaperDto;

public class NewsPaperDao {

    NewsPaperDto dto;

    public boolean createNewsPaper(NewsPaperDto dto){
        System.out.println("Create News Paper is Created");
       boolean isNewsPaperCreated=false;
        if(null!=dto){
            this.dto=dto;
            isNewsPaperCreated=true;
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
