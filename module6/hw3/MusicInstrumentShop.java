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

    public List<MusicalInstruments> prepareInstruments(Map<String, Integer> order)  throws NegativeValueException {
        List<MusicalInstruments> output = new ArrayList<MusicalInstruments>();

        Set<String> instruments = order.keySet();
        Iterator<String> iterator = instruments.iterator();

        while (iterator.hasNext()) {

            switch (iterator.next()) {
                case MusicalInstruments.INSTRUMENT_GUITAR_NAME:
                    if (guitarCount - order.get(MusicalInstruments.INSTRUMENT_GUITAR_NAME) < 0) {
                        if (guitarCount + Stock.guitarCount - order.get(MusicalInstruments.INSTRUMENT_GUITAR_NAME) < 0) {
                            throw new NegativeValueException();
                        } else {
                            Stock.guitarCount = Stock.guitarCount +guitarCount - order.get(MusicalInstruments.INSTRUMENT_GUITAR_NAME);
                            guitarCount = 0;
                        }
                    } else {
                        guitarCount = guitarCount - order.get(MusicalInstruments.INSTRUMENT_GUITAR_NAME);
                    }

                    iterator.remove();
                    break;

                case MusicalInstruments.INSTRUMENT_PIANO_NAME:
                    if (pianoCount - order.get(MusicalInstruments.INSTRUMENT_PIANO_NAME) < 0) {
                        if (pianoCount + Stock.pianoCount - order.get(MusicalInstruments.INSTRUMENT_PIANO_NAME) < 0) {
                            throw new NegativeValueException();
                        } else {
                            Stock.pianoCount = Stock.pianoCount + pianoCount - order.get(MusicalInstruments.INSTRUMENT_PIANO_NAME);
                            pianoCount = 0;
                        }
                    } else {
                        pianoCount = pianoCount - order.get(MusicalInstruments.INSTRUMENT_PIANO_NAME);
                    }
                    iterator.remove();
                    break;

                case MusicalInstruments.INSTRUMENT_TRUMPET_NAME:
                    if (trumpetCount - order.get(MusicalInstruments.INSTRUMENT_TRUMPET_NAME) < 0) {
                        if (trumpetCount + Stock.trumpetCount - order.get(MusicalInstruments.INSTRUMENT_TRUMPET_NAME) < 0) {
                            throw new NegativeValueException();
                        } else {
                            Stock.trumpetCount = Stock.trumpetCount +trumpetCount - order.get(MusicalInstruments.INSTRUMENT_TRUMPET_NAME);
                            trumpetCount = 0;
                        }
                    } else {
                        trumpetCount = trumpetCount - order.get(MusicalInstruments.INSTRUMENT_TRUMPET_NAME);
                    }

                    iterator.remove();
                    break;
            }
        }

        System.out.println("You have " + guitarCount + " Guitars, "
                + pianoCount + " Pianos, "
                + trumpetCount + " Trumpets on showRoom");

        System.out.println("You have " + Stock.guitarCount + " Guitars, "
                + Stock.pianoCount + " Pianos, "
                + Stock.trumpetCount + " Trumpets on Stock");
        System.out.println();

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
