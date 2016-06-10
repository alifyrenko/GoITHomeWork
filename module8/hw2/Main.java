package com.goit.gojavaonline.module8.hw2;

import java.util.*;

/**
 * Created by ANTON on 31.05.2016.
 */
public class Main {
    public static void main(String[] args) {


        Set<MusicalInstrument> musicalInstrumentSet = new TreeSet<>(new CompareWeight());

        musicalInstrumentSet.add(new Piano("Piano", "Green", 200));
        musicalInstrumentSet.add(new Trumpet("Trumpet", "Yellow", 5));
        musicalInstrumentSet.add(new Guitar("Bass Guitar", "Black", 3));
        musicalInstrumentSet.add(new Guitar("Electro Guitar", "White", 4));
        musicalInstrumentSet.add(new Guitar("Classic Guitar", "Gray", 2));

        musicalInstrumentSet.stream().forEach(p -> System.out.println(p));

        System.out.println();

        Set<MusicalInstrument> musicalInstrumentSet1 = new TreeSet<>(new CompareColor());

        musicalInstrumentSet1.add(new Piano("Piano", "Green", 200));
        musicalInstrumentSet1.add(new Trumpet("Trumpet", "Yellow", 5));
        musicalInstrumentSet1.add(new Guitar("Bass Guitar", "Black", 3));
        musicalInstrumentSet1.add(new Guitar("Electro Guitar", "White", 4));
        musicalInstrumentSet1.add(new Guitar("Classic Guitar", "Gray", 2));

        musicalInstrumentSet1.stream().forEach(p -> System.out.println(p));
    }
}