package com.goit.gojavaonline.module8.hw2;

import java.util.Comparator;

/**
 * Created by ANTON on 10.06.2016.
 */
public class CompareName implements Comparator <MusicalInstrument> {
    @Override
    public int compare(MusicalInstrument o1, MusicalInstrument o2) {
        return  o1.getName().compareTo(o2.getName());
    }
}
