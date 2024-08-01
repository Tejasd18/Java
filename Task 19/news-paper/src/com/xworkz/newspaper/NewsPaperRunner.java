package com.xworkz.newspaper;

import com.xworkz.newspaper.dao.NewsPaperDao;
import com.xworkz.newspaper.dto.NewsPaperDto;

public class NewsPaperRunner {

    public static void main(String[] args) {
        System.out.println("Main Started");

        NewsPaperDto dto = new NewsPaperDto();
        dto.id=1;
        dto.circulation=2854147;
        dto.language="English";
        dto.name="The Times Of India";
        dto.price=5.00;
        dto.noOfPages=40;

        NewsPaperDao newsPaperDao=new NewsPaperDao();
        newsPaperDao.createNewsPaper(dto);
        newsPaperDao.getNewsPaperDetails();

        System.out.println("Main is Ended");
    }

}
