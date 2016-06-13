package com.goit.gojavaonline.module8.hw1;

import com.goit.gojavaonline.module8.hw2.Color;
import com.goit.gojavaonline.module8.hw2.Instruments;

/**
 * Created by ANTON on 07.06.2016.
 */
public abstract class MusicInstrument {
    Instruments name;
    Color color;
    int weight;

    public MusicInstrument(Instruments name, Color color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    abstract void play();

    @Override
    public String toString() {
        return String.format("%-17s%-8s%-6d", name, color, weight);
    }
}
