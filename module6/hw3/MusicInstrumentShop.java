package com.goit.gojavaonline.module6.hw3;

import javax.swing.plaf.synth.SynthRootPaneUI;
import java.util.*;

/**
 * Created by ANTON on 01.06.2016.
 */
public class MusicInstrumentShop {

    private int guitarCountOnShowRoom;
    private int pianoCountOnShowRoom;
    private int trumpetCountOnShowRoom;

    private int orderInstrumentCount = 0;

    Stock stock = new Stock(5,5,5);

    private List<MusicalInstruments> musicalInstrumentsList;

    public MusicInstrumentShop(int guitarCountOnShowRoom, int pianoCountOnShowRoom, int trumpetCountOnShowRoom) {
        this.guitarCountOnShowRoom = guitarCountOnShowRoom;
        this.pianoCountOnShowRoom = pianoCountOnShowRoom;
        this.trumpetCountOnShowRoom = trumpetCountOnShowRoom;
    }


    public void updateBalanceOnStock(String instrument){
        switch (instrument){
            case MusicalInstruments.INSTRUMENT_TRUMPET_NAME:
                stock.setTrumpetCount(stock.getTrumpetCount() - orderInstrumentCount + trumpetCountOnShowRoom);
                break;
            case MusicalInstruments.INSTRUMENT_PIANO_NAME:
                stock.setPianoCount(stock.getPianoCount() - orderInstrumentCount + pianoCountOnShowRoom);
                break;
            case MusicalInstruments.INSTRUMENT_GUITAR_NAME:
                stock.setGuitarCount(stock.getGuitarCount() - orderInstrumentCount + guitarCountOnShowRoom);
        }
    }

    public List<MusicalInstruments> prepareInstruments(Map<String, Integer> order)  throws NegativeValueException {
        List<MusicalInstruments> output = new ArrayList<MusicalInstruments>();

        Set<String> instruments = order.keySet();
        Iterator<String> iterator = instruments.iterator();

        while (iterator.hasNext()) {

            switch (iterator.next()) {
                case MusicalInstruments.INSTRUMENT_GUITAR_NAME:
                    orderInstrumentCount = order.get(MusicalInstruments.INSTRUMENT_GUITAR_NAME);

                    if (guitarCountOnShowRoom < orderInstrumentCount) {
                        if (guitarCountOnShowRoom + stock.getGuitarCount() < orderInstrumentCount) {
                            throw new NegativeValueException();
                        } else {
                            updateBalanceOnStock(MusicalInstruments.INSTRUMENT_GUITAR_NAME);
                            guitarCountOnShowRoom = 0;
                        }
                    } else {
                        guitarCountOnShowRoom = guitarCountOnShowRoom - orderInstrumentCount;
                    }

                    iterator.remove();
                    break;

                case MusicalInstruments.INSTRUMENT_PIANO_NAME:
                    orderInstrumentCount = order.get(MusicalInstruments.INSTRUMENT_PIANO_NAME);

                    if (pianoCountOnShowRoom < orderInstrumentCount) {
                        if (pianoCountOnShowRoom + stock.getPianoCount() < orderInstrumentCount) {
                            throw new NegativeValueException();
                        } else {
                            updateBalanceOnStock(MusicalInstruments.INSTRUMENT_PIANO_NAME);
                            pianoCountOnShowRoom = 0;
                        }
                    } else {
                        pianoCountOnShowRoom = pianoCountOnShowRoom - orderInstrumentCount;
                    }

                    iterator.remove();
                    break;

                case MusicalInstruments.INSTRUMENT_TRUMPET_NAME:
                    orderInstrumentCount = order.get(MusicalInstruments.INSTRUMENT_TRUMPET_NAME);

                    if (trumpetCountOnShowRoom < orderInstrumentCount) {
                        if (trumpetCountOnShowRoom + stock.getTrumpetCount() < orderInstrumentCount) {
                            throw new NegativeValueException();
                        } else {
                            updateBalanceOnStock(MusicalInstruments.INSTRUMENT_TRUMPET_NAME);
                            trumpetCountOnShowRoom = 0;
                        }
                    } else {
                        trumpetCountOnShowRoom = trumpetCountOnShowRoom - orderInstrumentCount;
                    }

                    iterator.remove();
                    break;
            }
        }

        System.out.println("You have " + guitarCountOnShowRoom + " Guitars, "
                + pianoCountOnShowRoom + " Pianos, "
                + trumpetCountOnShowRoom + " Trumpets on showRoom");

        System.out.println("You have " + stock.getGuitarCount() + " Guitars, "
                + stock.getPianoCount() + " Pianos, "
                + stock.getTrumpetCount() + " Trumpets on Stock");
        System.out.println();

        return output;
    }

    public int getGuitarCountOnShowRoom() {
        return guitarCountOnShowRoom;
    }

    public void setGuitarCountOnShowRoom(int guitarCountOnShowRoom) {
        this.guitarCountOnShowRoom = guitarCountOnShowRoom;
    }

    public int getPianoCountOnShowRoom() {
        return pianoCountOnShowRoom;
    }

    public void setPianoCountOnShowRoom(int pianoCountOnShowRoom) {
        this.pianoCountOnShowRoom = pianoCountOnShowRoom;
    }

    public int getTrumpetCountOnShowRoom() {
        return trumpetCountOnShowRoom;
    }

    public void setTrumpetCountOnShowRoom(int trumpetCountOnShowRoom) {
        this.trumpetCountOnShowRoom = trumpetCountOnShowRoom;
    }

    public int getOrderInstrumentCount() {
        return orderInstrumentCount;
    }

    public void setOrderInstrumentCount(int orderInstrumentCount) {
        this.orderInstrumentCount = orderInstrumentCount;
    }
}