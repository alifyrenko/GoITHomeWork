package com.goit.gojavaonline.module8.hw2;

/**
 * Created by ANTON on 25.05.2016.
 */
public class Piano extends MusicalInstrument {

    public Piano(String name, String color, int weight) {
        super(name, color, weight);
    }

    @Override
    public void play() {
        System.out.println("Piano play");
    }
}
