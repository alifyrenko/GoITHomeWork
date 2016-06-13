package com.goit.gojavaonline.module8.hw1;

import com.goit.gojavaonline.module8.hw2.Color;
import com.goit.gojavaonline.module8.hw2.Instruments;

/**
 * Created by ANTON on 07.06.2016.
 */
public class Trumpet extends MusicInstrument{

    public Trumpet(Instruments name, Color color, int weight) {
        super(name, color, weight);
    }

    @Override
    void play() {
        System.out.println("Play trumpet");
    }
}
