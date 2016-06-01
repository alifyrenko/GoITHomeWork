package com.goit.gojavaonline.module3.hw3;

/**
 * Created by ANTON on 25.05.2016.
 */
public class Guitar extends MusicalInstrument {

    @Override
    public void play() {
        System.out.println("Guitar play");
    }

    public String getInstrumentName() {
        return GUITAR_INSTRUMENT_NAME;
    }

    public int getInstrumentWeight() {
        return 50;
    }
}
