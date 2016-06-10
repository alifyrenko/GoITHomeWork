package com.goit.gojavaonline.module8.hw2;

/**
 * Created by ANTON on 25.05.2016.
 */
public class Guitar extends MusicalInstrument {

    public Guitar(String name, String color, int weight) {
        super(name, color, weight);
    }

    @Override
    public void play() {
        System.out.println("Guitar play");
    }

}
