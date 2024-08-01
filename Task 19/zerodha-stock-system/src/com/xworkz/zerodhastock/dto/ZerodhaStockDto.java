package com.xworkz.zerodhastock.dto;

public class ZerodhaStockDto {

    private String stockName;
    private int StockId;
    private int lotSize;
    private double price;
    private String expDate;

    public ZerodhaStockDto(){
        System.out.println("The Details of the Stock is Invalid");
    }

    public ZerodhaStockDto(String stockName,int stockId,int lotSize,double price,String expDate){
        this.stockName=stockName;
        this.StockId=stockId;
        this.lotSize=lotSize;
        this.price=price;
        this.expDate=expDate;
    }
    //setter and getter for the encapsulation oops concept is been used
    public String getStockName() {
        return stockName;
    }
    public int getLotSize() {
        return lotSize;
    }
    public double getPrice() {
        return price;
    }
    public int getStockId() {
        return StockId;
    }
    public String getExpDate() {
        return expDate;
    }
}
