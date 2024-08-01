package com.xworkz.zerodhastock.dao;

import com.xworkz.zerodhastock.dto.ZerodhaStockDto;

public class ZerodhaStockDao {

    ZerodhaStockDto dto;

    public boolean addZerodhaStock(ZerodhaStockDto dto){
        boolean isZerodhaAdded=false;
        boolean isStockNameValid=false;
        boolean isStockIdValid=false;
        boolean isExpDateValid=false;
        boolean isLotSizeValid=false;
        boolean isPriceValid=false;
        if (dto != null){
            if (dto.getStockName()!=null){
                isStockNameValid=true;
            }else System.out.println("Please Enter a Valid stock Name");
            if (dto.getStockId()>0){
                isStockIdValid=true;
            }else System.out.println("Please Enter a Valid Stock Id");
            if (dto.getExpDate()!=null){
                isExpDateValid=true;
            }else System.out.println("Please Enter a Valid Exp Date");
            if (dto.getLotSize()>0){
                isLotSizeValid=true;
            }else System.out.println("Please Enter a Valid Lot Size");
            if (dto.getPrice()>0.0){
                isPriceValid=true;
            }else System.out.println("Please Enter a Valid Price");
            if (isExpDateValid==true && isStockIdValid==true && isPriceValid==true &&
            isLotSizeValid==true && isStockNameValid==true){
                isZerodhaAdded=true;
                this.dto=dto;
            }else System.out.println("Entered Data is InValid");
        }else System.out.println("Entered Data is Not Found");
        return isZerodhaAdded;
    }

    public void getZerodhaInfo(){
        System.out.println("Stock Name :"+dto.getStockName());
        System.out.println("Stock Id :"+dto.getStockId());
        System.out.println("Stock Expiry Date :"+dto.getExpDate());
        System.out.println("Stock's Lot Size :"+dto.getLotSize());
        System.out.println("Stock Price :"+dto.getPrice());
    }

}
