package com.goit.gojavaonline.module8.hw1;

import com.goit.gojavaonline.module7.Object1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ANTON on 07.06.2016.
 */
public class Runner {
    public static void main(String[] args) {

        List<MusicInstrument> instrumentsList = new ArrayList<>();

        instrumentsList.add(new Guitar("BassGuitar", "Yellow", 5));
        instrumentsList.add(new Guitar("ClassicGuitar", "Blue", 3));
        instrumentsList.add(new Piano("Piano", "Red", 300));
        instrumentsList.add(new Trumpet("Trumpet", "Green", 2));

        instrumentsList
                .stream()
                .map(instr -> instr.name + " " + instr.color + " " + instr.weight)
                .forEach(p -> System.out.println(p));

    }
}
