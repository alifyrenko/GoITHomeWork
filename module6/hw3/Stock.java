package com.goit.gojavaonline.module6.hw3;

import java.util.HashMap;
import java.util.Map;


/**
 * Created by ANTON on 01.06.2016.
 */
public class Stock {

    Map<String, Integer> stockMap = new HashMap<>();

    public Stock(int guitarCount, int pianoCount, int trumpetCount) {
        int guitarCount1 = guitarCount;
        int trumpetCount1 = trumpetCount;
        int pianoCount1 = pianoCount;

        stockMap.put(MusicalInstrument.INSTRUMENT_GUITAR_NAME, guitarCount);
        stockMap.put(MusicalInstrument.INSTRUMENT_PIANO_NAME, pianoCount);
        stockMap.put(MusicalInstrument.INSTRUMENT_TRUMPET_NAME, trumpetCount);
    }
}
