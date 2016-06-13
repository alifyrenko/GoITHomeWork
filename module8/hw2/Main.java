package com.goit.gojavaonline.module8.hw2;

import java.util.*;

/**
 * Created by ANTON on 31.05.2016.
 */
public class Main {
    public static void main(String[] args) {


        Printer printer = new Printer();
        Set<MusicalInstrument> musicInstrSetSortByWeight = new TreeSet<>(new CompareWeight());

        System.out.println("Sorted by weight");

        musicInstrSetSortByWeight.add(new Piano(Instruments.PIANO, Color.BLACK, 200));
        musicInstrSetSortByWeight.add(new Trumpet(Instruments.TRUMPET, Color.GRAY, 5));
        musicInstrSetSortByWeight.add(new Guitar(Instruments.BASS_GUITAR, Color.GREEN, 6));
        musicInstrSetSortByWeight.add(new Guitar(Instruments.ELECTRO_GUITAR, Color.WHITE, 4));
        musicInstrSetSortByWeight.add(new Guitar(Instruments.CLASSIC_GUITAR, Color.YELLOW, 6));


        printer.printList(musicInstrSetSortByWeight);

        Set<MusicalInstrument> musicInstrSetSortByColor = new TreeSet<>(new CompareColor());

        System.out.println("Sorted by Color");

        musicInstrSetSortByColor.add(new Piano(Instruments.PIANO, Color.BLACK, 200));
        musicInstrSetSortByColor.add(new Trumpet(Instruments.TRUMPET, Color.GRAY, 5));
        musicInstrSetSortByColor.add(new Guitar(Instruments.BASS_GUITAR, Color.GREEN, 3));
        musicInstrSetSortByColor.add(new Guitar(Instruments.ELECTRO_GUITAR, Color.WHITE, 4));
        musicInstrSetSortByColor.add(new Guitar(Instruments.CLASSIC_GUITAR, Color.YELLOW, 2));

        printer.printList(musicInstrSetSortByColor);

        Set<MusicalInstrument> musicInstrSetSortByName = new TreeSet<>(new CompareName());

        System.out.println("Sorted by Name");

        musicInstrSetSortByName.add(new Piano(Instruments.PIANO, Color.BLACK, 200));
        musicInstrSetSortByName.add(new Trumpet(Instruments.TRUMPET, Color.GRAY, 5));
        musicInstrSetSortByName.add(new Guitar(Instruments.BASS_GUITAR, Color.GREEN, 3));
        musicInstrSetSortByName.add(new Guitar(Instruments.ELECTRO_GUITAR, Color.WHITE, 4));
        musicInstrSetSortByName.add(new Guitar(Instruments.CLASSIC_GUITAR, Color.YELLOW, 2));

        printer.printList(musicInstrSetSortByName);
    }
}