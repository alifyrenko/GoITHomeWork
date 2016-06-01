package com.goit.gojavaonline.module6.hw3;

import com.goit.gojavaonline.module3.hw3.MusicalInstrument;

import java.util.*;

/**
 * Created by ANTON on 30.05.2016.
 */
public class Main {
    public static void main(String[] args) throws NegativeValueException {
        MusicInstrumentShop musicInstrumentShop = new MusicInstrumentShop(16, 2, 7);
        //Stock stock = new Stock(4,1,12);

        Map<String, Integer> order = new HashMap<>();

        order.put(MusicalInstruments.INSTRUMENT_GUITAR_NAME, 7);
        order.put(MusicalInstruments.INSTRUMENT_TRUMPET_NAME, 2);
        musicInstrumentShop.prepareInstruments(order);

        order.put(MusicalInstruments.INSTRUMENT_PIANO_NAME, 1);
        musicInstrumentShop.prepareInstruments(order);

        order.put(MusicalInstruments.INSTRUMENT_PIANO_NAME, 1);
        order.put(MusicalInstruments.INSTRUMENT_GUITAR_NAME, 8);
        order.put(MusicalInstruments.INSTRUMENT_TRUMPET_NAME, 6);

        musicInstrumentShop.prepareInstruments(order);

    }
}
