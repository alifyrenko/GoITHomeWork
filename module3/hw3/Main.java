package com.goit.gojavaonline.module3.hw3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by ANTON on 31.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        MusicalShop musicalShop = new MusicalShop(3, 5, 1);

        Map<String, Integer> order = new HashMap<>();
        order.put(MusicalInstrument.GUITAR_INSTRUMENT_NAME, 2);
        order.put(MusicalInstrument.PIANO_INSTRUMENT_NAME, 1);
        order.put(MusicalInstrument.TRAMPET_INSTRUMENT_NAME, 3);

        List<MusicalInstrument> musicalInstruments = musicalShop.prepareInstruments(order);
    }
}
