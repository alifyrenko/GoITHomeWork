package com.goit.gojavaonline.module8.hw1;

/**
 * Created by ANTON on 07.06.2016.
 */
public class Piano extends MusicInstrument {

    public Piano(String name, String color, int weight) {
        super(name, color, weight);
    }

    @Override
    void play() {
        System.out.println("Play piano");
    }
}
