package com.goit.gojavaonline.module8.hw1;

/**
 * Created by ANTON on 07.06.2016.
 */
public abstract class MusicInstrument {
    String name;
    String color;
    int weight;

    public MusicInstrument(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    abstract void play();

    @Override
    public String toString() {
        return "MusicInstrument{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
