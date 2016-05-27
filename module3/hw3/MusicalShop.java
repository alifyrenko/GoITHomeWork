package com.goit.gojavaonline.module3.hw3;

import java.util.List;

/**
 * Created by ANTON on 25.05.2016.
 */
public class MusicalShop {

    private String shopName;
    private String shopAddress;
    private List<MusicalInstrument> musicalInstrumentList;

    private void saleInstrument(){}

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public List<MusicalInstrument> getMusicalInstrumentList() {
        return musicalInstrumentList;
    }

    public void setMusicalInstrumentList(List<MusicalInstrument> musicalInstrumentList) {
        this.musicalInstrumentList = musicalInstrumentList;
    }
}
