package com.goit.gojavaonline.module6.training;

import com.goit.gojavaonline.module6.hw3.NegativeValueException;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by ANTON on 02.06.2016.
 */
public class MusicShop {

    private int guitarCount;
    private int pianoCount;
    private int trumpetCount;

    Stock stock = new Stock(5, 5, 5);

    public MusicShop(int guitarCount, int pianoCount, int trumpetCount) {
        this.guitarCount = guitarCount;
        this.pianoCount = pianoCount;
        this.trumpetCount = trumpetCount;
    }

    public void prepareInstruments(Map<String, Integer> order) throws NegativeValueException {

        Set<String> instruments = order.keySet();
        Iterator<String> iterator = instruments.iterator();

        while (iterator.hasNext()) {

            switch (iterator.next()) {
                case MusicInstrument.GUITAR_INSTRUMENT_NAME:
                    if (guitarCount < order.get(MusicInstrument.GUITAR_INSTRUMENT_NAME)) {
                        if (guitarCount + stock.getGuitarCount() < order.get(MusicInstrument.GUITAR_INSTRUMENT_NAME)) {
                            throw new NegativeValueException();
                        } else {
                            stock.setGuitarCount(stock.getGuitarCount() + guitarCount - order.get(MusicInstrument.GUITAR_INSTRUMENT_NAME));
                            guitarCount = 0;
                        }
                    } else {
                        guitarCount = guitarCount - order.get(MusicInstrument.GUITAR_INSTRUMENT_NAME);
                    }
                    iterator.remove();
                    break;

                case MusicInstrument.PIANO_INSTRUMENT_NAME:
                    if (pianoCount < order.get(MusicInstrument.PIANO_INSTRUMENT_NAME)) {
                        if (pianoCount + stock.getPianoCount() < order.get(MusicInstrument.PIANO_INSTRUMENT_NAME)) {
                            throw new NegativeValueException();
                        } else {
                            stock.setPianoCount(stock.getPianoCount() + pianoCount - order.get(MusicInstrument.PIANO_INSTRUMENT_NAME));
                            pianoCount = 0;
                        }
                    } else {
                        pianoCount = pianoCount - order.get(MusicInstrument.PIANO_INSTRUMENT_NAME);
                    }
                    iterator.remove();
                    break;

                case MusicInstrument.TRUMPET_INSTRUMENT_NAME:
                    if (trumpetCount < order.get(MusicInstrument.TRUMPET_INSTRUMENT_NAME)) {
                        if (trumpetCount + stock.getTrumpetCount() < order.get(MusicInstrument.TRUMPET_INSTRUMENT_NAME)) {
                            throw new NegativeValueException();
                        } else {
                            stock.setTrumpetCount(stock.getTrumpetCount() + trumpetCount - order.get(MusicInstrument.TRUMPET_INSTRUMENT_NAME));
                            trumpetCount = 0;
                        }
                    } else {
                        trumpetCount = trumpetCount - order.get(MusicInstrument.TRUMPET_INSTRUMENT_NAME);
                    }
                    iterator.remove();

                    break;
            }
        }

        System.out.println("You have " + guitarCount + " guitars, " + pianoCount + " pianos, " + trumpetCount + " trumpets on your showRoom!");
        System.out.println("You have " + stock.getGuitarCount() + " guitars, " + stock.getPianoCount() + " pianos, " + stock.getTrumpetCount() + " trumpets on your Stock!");
        System.out.println();
    }
}



