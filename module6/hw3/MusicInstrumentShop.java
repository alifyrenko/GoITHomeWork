package com.goit.gojavaonline.module6.hw3;

import java.util.*;

/**
 * Created by ANTON on 01.06.2016.
 */
public class MusicInstrumentShop {

    private int guitarCount;
    private int pianoCount;
    private int trumpetCount;

    private List<MusicalInstruments> musicalInstrumentsList;

    public MusicInstrumentShop(int guitarCount, int pianoCount, int trumpetCount) {
        this.guitarCount = guitarCount;
        this.pianoCount = pianoCount;
        this.trumpetCount = trumpetCount;
    }

    public List<MusicalInstruments> prepareInstruments(Map<String, Integer> order) throws NegativeValueException {
        List<MusicalInstruments> output = new ArrayList<MusicalInstruments>();

        Set<String> instruments = order.keySet();
        Iterator<String> iterator = instruments.iterator();

        while (iterator.hasNext()) {

            switch (iterator.next()) {
                case MusicalInstruments.INSTRUMENT_GUITAR_NAME:
                    guitarCount = guitarCount - order.get(MusicalInstruments.INSTRUMENT_GUITAR_NAME);
                    if (guitarCount < 0) {
                        guitarCount = guitarCount + order.get(MusicalInstruments.INSTRUMENT_GUITAR_NAME);
                        throw new NegativeValueException(guitarCount);
                    }
                    iterator.remove();
                    break;

                case MusicalInstruments.INSTRUMENT_PIANO_NAME:
                    pianoCount = pianoCount - order.get(MusicalInstruments.INSTRUMENT_PIANO_NAME);
                    if (pianoCount < 0) {
                        pianoCount = pianoCount + order.get(MusicalInstruments.INSTRUMENT_PIANO_NAME);
                        throw new NegativeValueException(pianoCount);
                    }
                    iterator.remove();
                    break;

                case MusicalInstruments.INSTRUMENT_TRUMPET_NAME:
                    trumpetCount = trumpetCount - order.get(MusicalInstruments.INSTRUMENT_TRUMPET_NAME);
                    if (trumpetCount < 0) {
                        trumpetCount = trumpetCount + order.get(MusicalInstruments.INSTRUMENT_TRUMPET_NAME);
                        throw new NegativeValueException(trumpetCount);
                    }
                    iterator.remove();
                    break;
            }
        }

        System.out.println("You have " + guitarCount + " Guitars, "
                + pianoCount + " Pianos, "
                + trumpetCount + " Trumpets on your balance");

        return output;
    }

    public int getGuitarCount() {
        return guitarCount;
    }

    public void setGuitarCount(int guitarCount) {
        this.guitarCount = guitarCount;
    }

    public int getPianoCount() {
        return pianoCount;
    }

    public void setPianoCount(int pianoCount) {
        this.pianoCount = pianoCount;
    }

    public int getTrumpetCount() {
        return trumpetCount;
    }

    public void setTrumpetCount(int trumpetCount) {
        this.trumpetCount = trumpetCount;
    }
}
