package com.example.eticketing;

import java.util.ArrayList;

public class PesawatData {
    public static String [][] data = new String[][]{
            {"Garuda Indonesia", "1500000", "https://1.bp.blogspot.com/-2-OdcF9BN18/WebEqBdXt5I/AAAAAAAAELU/Kr5ZurpbQMcCbhCdsyMF0Y_IzyXP0YtFQCEwYBhgL/s320/garuda%2Bindonesia.jpg"},
            {"Lion Air", "800000", "https://penanegeri.com/wp-content/uploads/2019/01/logo-lion-air.jpg"},
            {"Citilink", "1200000", "https://cdn.pixabay.com/photo/2015/07/09/13/05/citilink-837863_640.png"}
    };

    public static ArrayList<Pesawat> getListData(){
        ArrayList<Pesawat> list = new ArrayList<>();
        for (String[] aData : data){
            Pesawat psw = new Pesawat();
            psw.setName(aData[0]);
            psw.setHarga(aData[1]);
            psw.setPhoto(aData[2]);
            list.add(psw);
        }
        return list;
    }
}
