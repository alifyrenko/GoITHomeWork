package com.goit.gojavaonline.module6.hw3;

import java.util.*;

/**
 * Created by ANTON on 30.05.2016.
 */
public class Main {
    public static void main(String[] args) throws NegativeValueException {

        MusicInstrumentShop musicInstrumentShop = new MusicInstrumentShop(16, 2, 7);

        Map<String, Integer> order = new HashMap<>();

        order.put(MusicalInstrument.INSTRUMENT_TRUMPET_NAME, 1);
        order.put(MusicalInstrument.INSTRUMENT_GUITAR_NAME, 10);

        musicInstrumentShop.prepareInstruments(order);

        order.put(MusicalInstrument.INSTRUMENT_PIANO_NAME, 4);
        order.put(MusicalInstrument.INSTRUMENT_TRUMPET_NAME, 2);

        musicInstrumentShop.prepareInstruments(order);

        order.put(MusicalInstrument.INSTRUMENT_PIANO_NAME, 3);
        order.put(MusicalInstrument.INSTRUMENT_TRUMPET_NAME, 8);
        order.put(MusicalInstrument.INSTRUMENT_GUITAR_NAME, 10);

        musicInstrumentShop.prepareInstruments(order);



    }
}
