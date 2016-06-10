package com.goit.gojavaonline.module8.hw2;

/**
 * Created by ANTON on 25.05.2016.
 */
public abstract class MusicalInstrument {

    private String name;
    private String color;
    private int weight;

    public MusicalInstrument(String name, String color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public abstract void play();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "MusicalInstrument{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
