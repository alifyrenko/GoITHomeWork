package com.goit.gojavaonline.module8.hw1;

import com.goit.gojavaonline.module6.hw3.MusicalInstruments;

/**
 * Created by ANTON on 07.06.2016.
 */
public class Guitar extends MusicInstrument {

    public Guitar(String name, String color, int weight) {
        super(name, color, weight);
    }

    @Override
    void play() {
        System.out.println("Play guitar");
    }

}