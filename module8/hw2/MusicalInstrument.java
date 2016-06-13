package com.goit.gojavaonline.module8.hw2;

/**
 * Created by ANTON on 25.05.2016.
 */
public abstract class MusicalInstrument {

    private Instruments name;
    private Color color;
    private int weight;

    public MusicalInstrument(Instruments name, Color color, int weight) {
        this.name = name;
        this.color = color;
        this.weight = weight;
    }

    public abstract void play();

    public Instruments getName() {
        return name;
    }

    public void setName(Instruments name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
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
        return String.format("%-17s%-8s%-6d", name, color, weight);
    }
}
