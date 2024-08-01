package com.xworkz.zerodhastock;

import com.xworkz.zerodhastock.dao.ZerodhaStockDao;
import com.xworkz.zerodhastock.dto.ZerodhaStockDto;

public class ZerodhaStockRunner {

    public static void main(String[] args) {

        ZerodhaStockDao zerodhaStockDao = new ZerodhaStockDao();

        ZerodhaStockDto zerodhaStockDto = new ZerodhaStockDto("Reliance",12,10,2999.90,"26-7-24");
//        zerodhaStockDto.StockId=12;
//        zerodhaStockDto.stockName="Reliance";
//        zerodhaStockDto.expDate="26-07-24";
//        zerodhaStockDto.lotSize=10;
//        zerodhaStockDto.price=2999.90;
        zerodhaStockDao.addZerodhaStock(zerodhaStockDto);

        zerodhaStockDao.getZerodhaInfo();
    }

}
