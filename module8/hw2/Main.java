package com.goit.gojavaonline.module8.hw2;

import java.util.*;

/**
 * Created by ANTON on 31.05.2016.
 */
public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer();
        Set<MusicalInstrument> musicalInstrumentSet = new TreeSet<>(new CompareWeight());

        musicalInstrumentSet.add(new Piano("Piano", "Green", 200));
        musicalInstrumentSet.add(new Trumpet("Trumpet", "Yellow", 5));
        musicalInstrumentSet.add(new Guitar("Bass Guitar", "Black", 3));
        musicalInstrumentSet.add(new Guitar("Electro Guitar", "White", 4));
        musicalInstrumentSet.add(new Guitar("Classic Guitar", "Gray", 2));


        printer.printList(musicalInstrumentSet);

        Set<MusicalInstrument> musicalInstrumentSet1 = new TreeSet<>(new CompareColor());

        musicalInstrumentSet1.add(new Piano("Piano", "Green", 200));
        musicalInstrumentSet1.add(new Trumpet("Trumpet", "Yellow", 5));
        musicalInstrumentSet1.add(new Guitar("Bass Guitar", "Black", 3));
        musicalInstrumentSet1.add(new Guitar("Electro Guitar", "White", 4));
        musicalInstrumentSet1.add(new Guitar("Classic Guitar", "Gray", 2));

        printer.printList(musicalInstrumentSet1);

        Set<MusicalInstrument> musicalInstrumentSet2 = new TreeSet<>(new CompareName());

        musicalInstrumentSet2.add(new Piano("Piano", "Green", 200));
        musicalInstrumentSet2.add(new Trumpet("Trumpet", "Yellow", 5));
        musicalInstrumentSet2.add(new Guitar("Bass Guitar", "Black", 3));
        musicalInstrumentSet2.add(new Guitar("Electro Guitar", "White", 4));
        musicalInstrumentSet2.add(new Guitar("Classic Guitar", "Gray", 2));

        printer.printList(musicalInstrumentSet2);
    }
}