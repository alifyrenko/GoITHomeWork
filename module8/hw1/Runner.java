package com.goit.gojavaonline.module8.hw1;

import com.goit.gojavaonline.module7.Object1;

import java.util.*;

/**
 * Created by ANTON on 07.06.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Printer printer = new Printer();
        List<MusicInstrument> instrumentsList = new ArrayList<>();

        instrumentsList.add(new Guitar("BassGuitar", "Yellow", 5));
        instrumentsList.add(new Guitar("ClassicGuitar", "Blue", 3));
        instrumentsList.add(new Piano("Piano", "Red", 300));
        instrumentsList.add(new Trumpet("Trumpet", "Green", 2));

        printer.printList(instrumentsList);

        System.out.println();

        Set<MusicInstrument> musicInstrumentSet = new HashSet<>();

        musicInstrumentSet.add(new Guitar("BassGuitar", "Yellow", 6));
        musicInstrumentSet.add(new Guitar("ClassicGuitar", "Blue", 8));
        musicInstrumentSet.add(new Guitar("Piano", "Red", 200));
        musicInstrumentSet.add(new Guitar("Trumpet", "Green", 30));

        printer.printList(musicInstrumentSet);

    }
}
