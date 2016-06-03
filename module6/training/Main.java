package com.goit.gojavaonline.module6.training;

import com.goit.gojavaonline.module6.hw3.NegativeValueException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ANTON on 02.06.2016.
 */
public class Main {
    public static void main(String[] args) {

        MusicShop musicShop = new MusicShop(10, 11, 12);
        Map<String, Integer> order = new HashMap<>();

        try {
            order.put(MusicInstrument.GUITAR_INSTRUMENT_NAME, 9);
            order.put(MusicInstrument.PIANO_INSTRUMENT_NAME, 10);
            order.put(MusicInstrument.TRUMPET_INSTRUMENT_NAME, 9);

            musicShop.prepareInstruments(order);

            order.put(MusicInstrument.TRUMPET_INSTRUMENT_NAME, 5);
            order.put(MusicInstrument.GUITAR_INSTRUMENT_NAME, 5);
            order.put(MusicInstrument.PIANO_INSTRUMENT_NAME, 5);
            musicShop.prepareInstruments(order);

            order.put(MusicInstrument.GUITAR_INSTRUMENT_NAME, 15);
            musicShop.prepareInstruments(order);



        } catch (NegativeValueException e) {
            System.out.println("You have not enough products on your stock!");
        }
    }
}
