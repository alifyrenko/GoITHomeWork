package com.goit.gojavaonline.module8.hw2;

import java.util.Collection;

/**
 * Created by ANTON on 10.06.2016.
 */
public class Printer {

    public void printList (Collection <MusicalInstrument> musicalInstrumentList){

        System.out.printf("%-17s%-8s%-6s", "Instrument Name", "Color", "Weight");
        System.out.println();
        System.out.println("------------------------------");
        musicalInstrumentList
                .stream()
                .forEach(p -> System.out.println(p));
        System.out.println();
    }
}
