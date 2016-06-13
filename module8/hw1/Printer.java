package com.goit.gojavaonline.module8.hw1;

import com.goit.gojavaonline.module8.hw2.MusicalInstrument;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by ANTON on 10.06.2016.
 */
public class Printer {

    public void printList (Collection<MusicInstrument> musicalInstrumentList){

        System.out.printf("%-17s%-8s%-6s", "Instrument Name", "Color", "Weight");
        System.out.println();
        System.out.println("------------------------------");

        musicalInstrumentList
                .stream()
                .forEach(p -> System.out.println(p));
    }
}
