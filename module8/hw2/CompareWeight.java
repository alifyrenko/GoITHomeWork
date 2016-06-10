package com.goit.gojavaonline.module8.hw2;

import java.util.Comparator;

/**
 * Created by ANTON on 10.06.2016.
 */
public class CompareWeight implements Comparator <MusicalInstrument> {

    @Override
    public int compare(MusicalInstrument o1, MusicalInstrument o2) {
        if (o1.getWeight() > o2.getWeight()){
            return 1;
        } else {
            return -1;
        }
    }
}
