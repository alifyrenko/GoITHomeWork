package com.goit.gojavaonline.module6.training;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by ANTON on 02.06.2016.
 */
public class MusicShop {

    private int guitarCount;
    private int pianoCount;
    private int trumpetCount;

    Stock stock;

    public MusicShop(int guitarCount, int pianoCount, int trumpetCount) {
        this.guitarCount = guitarCount;
        this.pianoCount = pianoCount;
        this.trumpetCount = trumpetCount;
    }

    public void prepareInstruments(Map<String, Integer> order) {

        Set<String> instruments = order.keySet();
        Iterator<String> iterator = instruments.iterator();
    }




}



