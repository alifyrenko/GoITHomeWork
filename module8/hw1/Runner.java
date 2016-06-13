package com.goit.gojavaonline.module8.hw1;

import com.goit.gojavaonline.module7.Object1;
import com.goit.gojavaonline.module8.hw2.Color;
import com.goit.gojavaonline.module8.hw2.Instruments;

import java.util.*;


/**
 * Created by ANTON on 07.06.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Printer printer = new Printer();
        List<MusicInstrument> instrumentsList = new ArrayList<>();

        instrumentsList.add(new Guitar(Instruments.BASS_GUITAR, Color.YELLOW, 5));
        instrumentsList.add(new Guitar(Instruments.CLASSIC_GUITAR, Color.WHITE, 3));
        instrumentsList.add(new Piano(Instruments.PIANO, Color.GREEN, 300));
        instrumentsList.add(new Trumpet(Instruments.TRUMPET, Color.BLACK, 2));

        printer.printList(instrumentsList);

        System.out.println();

        Set<MusicInstrument> musicInstrumentSet = new HashSet<>();

        musicInstrumentSet.add(new Guitar(Instruments.BASS_GUITAR, Color.YELLOW, 6));
        musicInstrumentSet.add(new Guitar(Instruments.CLASSIC_GUITAR, Color.GREEN, 1));
        musicInstrumentSet.add(new Guitar(Instruments.PIANO, Color.WHITE, 300));
        musicInstrumentSet.add(new Guitar(Instruments.TRUMPET, Color.GRAY, 2));

        printer.printList(musicInstrumentSet);

    }
}
