package com.goit.gojavaonline.module6.hw3;

import java.util.*;

/**
 * Created by ANTON on 01.06.2016.
 */
public class MusicInstrumentShop {

    private int orderInstrumentCount = 0;
    Stock stock = new Stock(5, 5, 5);
    private List<MusicalInstruments> musicalInstrumentsList;
    Map<String, Integer> showRoomMap = new HashMap<>();

    public MusicInstrumentShop(int guitarCountOnShowRoom, int pianoCountOnShowRoom, int trumpetCountOnShowRoom) {
        int guitarCountOnShowRoom1 = guitarCountOnShowRoom;
        int pianoCountOnShowRoom1 = pianoCountOnShowRoom;
        int trumpetCountOnShowRoom1 = trumpetCountOnShowRoom;

        showRoomMap.put(MusicalInstruments.INSTRUMENT_GUITAR_NAME, guitarCountOnShowRoom);
        showRoomMap.put(MusicalInstruments.INSTRUMENT_PIANO_NAME, pianoCountOnShowRoom);
        showRoomMap.put(MusicalInstruments.INSTRUMENT_TRUMPET_NAME, trumpetCountOnShowRoom);
    }

    public void updateBalance(String product) throws NegativeValueException {

        int currInstrumentCountShowRoom = showRoomMap.get(product);
        int currInstrumentCountStock = stock.stockMap.get(product);
        int totalInstrumentsCount = currInstrumentCountShowRoom + currInstrumentCountStock;
        int instrumentCountLeftOnStock = totalInstrumentsCount - orderInstrumentCount;
        int instrumentCountLeftOnShowRoom = currInstrumentCountShowRoom - orderInstrumentCount;

        if (currInstrumentCountShowRoom < orderInstrumentCount) {
            if (totalInstrumentsCount < orderInstrumentCount) {
                throw new NegativeValueException();
            } else {
                stock.stockMap.put(product, instrumentCountLeftOnStock);
                showRoomMap.put(product, 0);
            }
        } else {
            showRoomMap.put(product, instrumentCountLeftOnShowRoom);
        }
    }

    public List<MusicalInstruments> prepareInstruments(Map<String, Integer> order) throws NegativeValueException {
        List<MusicalInstruments> output = new ArrayList<MusicalInstruments>();

        Set<String> instruments = order.keySet();
        Iterator<String> iterator = instruments.iterator();

        while (iterator.hasNext()) {

            switch (iterator.next()) {
                case MusicalInstruments.INSTRUMENT_GUITAR_NAME:
                    orderInstrumentCount = order.get(MusicalInstruments.INSTRUMENT_GUITAR_NAME);
                    updateBalance(MusicalInstruments.INSTRUMENT_GUITAR_NAME);
                    iterator.remove();
                    break;

                case MusicalInstruments.INSTRUMENT_PIANO_NAME:
                    orderInstrumentCount = order.get(MusicalInstruments.INSTRUMENT_PIANO_NAME);
                    updateBalance(MusicalInstruments.INSTRUMENT_PIANO_NAME);
                    iterator.remove();
                    break;

                case MusicalInstruments.INSTRUMENT_TRUMPET_NAME:
                    orderInstrumentCount = order.get(MusicalInstruments.INSTRUMENT_TRUMPET_NAME);
                    updateBalance(MusicalInstruments.INSTRUMENT_TRUMPET_NAME);
                    iterator.remove();
                    break;
            }
        }

        System.out.println("You have " + showRoomMap.get(MusicalInstruments.INSTRUMENT_GUITAR_NAME) + " Guitars, "
                + showRoomMap.get(MusicalInstruments.INSTRUMENT_PIANO_NAME) + " Pianos, "
                + showRoomMap.get(MusicalInstruments.INSTRUMENT_TRUMPET_NAME) + " Trumpets on showRoom");

        System.out.println("You have " + stock.stockMap.get(MusicalInstruments.INSTRUMENT_GUITAR_NAME) + " Guitars, "
                + stock.stockMap.get(MusicalInstruments.INSTRUMENT_PIANO_NAME) + " Pianos, "
                + stock.stockMap.get(MusicalInstruments.INSTRUMENT_TRUMPET_NAME) + " Trumpets on Stock");
        System.out.println();

        return output;
    }

}