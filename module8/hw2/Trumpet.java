package com.goit.gojavaonline.module8.hw2;

/**
 * Created by ANTON on 25.05.2016.
 */
public class Trumpet extends MusicalInstrument {

    public Trumpet(Instruments name, Color color, int weight) {
        super(name, color, weight);
    }

    @Override
    public void play() {
        System.out.println("Trumpet play");
    }
}
