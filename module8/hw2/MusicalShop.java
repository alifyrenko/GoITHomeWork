package com.goit.gojavaonline.module8.hw2;

import java.util.*;

/**
 * Created by ANTON on 25.05.2016.
 */
public class MusicalShop {

    private String shopName;
    private String shopAddress;
    private List<MusicalInstrument> musicalInstrumentList;

    private int pianoCount;
    private int guitarCount;
    private int trumpetCount;

    public MusicalShop(int pianoCount, int guitarCount, int trumpetCount) {
        this.pianoCount = pianoCount;
        this.guitarCount = guitarCount;
        this.trumpetCount = trumpetCount;
    }

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

    public List<MusicalInstrument> prepareInstruments(Map<String, Integer> order) {
        List<MusicalInstrument> output = new ArrayList<MusicalInstrument>();
        return output;
    }
}
