package com.goit.gojavaonline.module6.training.restaurant;

import com.goit.gojavaonline.module6.hw3.NegativeValueException;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by ANTON on 03.06.2016.
 */
public class Stock {
    private int cabbageCount;
    private int tomatoesCount;
    private int oilCount;
    private int potatoesCount;
    private int beetCount;
    private int meatCount;
    private int bunCount;
    private int onionCount;
    private int cucumberCount;

    private boolean isEnoughProductsOnStock;
    private boolean isEnoughCabbageOnStock;
    private boolean isEnoughTomatoesOnStock;
    private boolean isEnoughOilOnStock;
    private boolean isEnoughPotatoesOnStock;
    private boolean isEnoughBeetOnStock;
    private boolean isEnoughMeatOnStock;
    private boolean isEnoughBunOnStock;
    private boolean isEnoughOnionOnStock;
    private boolean isEnoughCucumberOnStock;

    private int cabbageCountToOrder;
    private int tomatoesCountToOrder;
    private int oilCountToOrder;
    private int potatoesCountToOrder;
    private int beetCountToOrder;
    private int meatCountToOrder;
    private int bunCountToOrder;
    private int onionCountToOrder;
    private int cucumberCountToOrder;


    Borsch borsch = new Borsch();
    FriedMeat friedMeat = new FriedMeat();
    FriedPotatos friedPotatos = new FriedPotatos();
    Salad salad = new Salad();

    public Stock(int cabbageCount, int tomatoesCount, int oilCount, int potatoesCount, int beetCount, int meatCount, int bunCount, int onionCount, int cucumberCount) {
        this.cabbageCount = cabbageCount;
        this.tomatoesCount = tomatoesCount;
        this.oilCount = oilCount;
        this.potatoesCount = potatoesCount;
        this.beetCount = beetCount;
        this.meatCount = meatCount;
        this.bunCount = bunCount;
        this.onionCount = onionCount;
        this.cucumberCount = cucumberCount;
    }

    public boolean isEnoughProductsOnStock(Map<String, Integer> order) {

        Set<String> products = order.keySet();
        Iterator<String> iterator = products.iterator();

        while (iterator.hasNext()) {

            switch (iterator.next()) {
                case Dish.BORSCH_DISH_NAME:

                    isEnoughProductsOnStock = true;

                    isEnoughCabbageOnStock = cabbageCount >= order.get(Dish.BORSCH_DISH_NAME) * borsch.getCabbageCount();
                    if (isEnoughCabbageOnStock == true) {
                        cabbageCount = cabbageCount - order.get(Dish.BORSCH_DISH_NAME) * borsch.getCabbageCount();
                    } else {
                        cabbageCountToOrder = order.get(Dish.BORSCH_DISH_NAME) * borsch.getCabbageCount() - cabbageCount;
                    }

                    isEnoughTomatoesOnStock = tomatoesCount >= order.get(Dish.BORSCH_DISH_NAME) * borsch.getTomatoesCount();
                    if (isEnoughTomatoesOnStock == true) {
                        tomatoesCount = tomatoesCount - order.get(Dish.BORSCH_DISH_NAME) * borsch.getTomatoesCount();
                    } else {
                        tomatoesCountToOrder = order.get(Dish.BORSCH_DISH_NAME) * borsch.getTomatoesCount() - tomatoesCount;
                    }

                    isEnoughPotatoesOnStock = potatoesCount >= order.get(Dish.BORSCH_DISH_NAME) * borsch.getPotatoesCount();
                    if (isEnoughPotatoesOnStock == true) {
                        potatoesCount = potatoesCount - order.get(Dish.BORSCH_DISH_NAME) * borsch.getPotatoesCount();
                    } else {
                        potatoesCountToOrder = order.get(Dish.BORSCH_DISH_NAME) * borsch.getPotatoesCount() - potatoesCount;
                    }

                    isEnoughBeetOnStock = beetCount >= order.get(Dish.BORSCH_DISH_NAME) * borsch.getBeetCount();
                    if (isEnoughBeetOnStock == true) {
                        beetCount = beetCount - order.get(Dish.BORSCH_DISH_NAME) * borsch.getBeetCount();
                    } else {
                        beetCountToOrder = order.get(Dish.BORSCH_DISH_NAME) * borsch.getBeetCount() - beetCount;
                    }

                    isEnoughMeatOnStock = meatCount >= order.get(Dish.BORSCH_DISH_NAME) * borsch.getMeatCount();
                    if (isEnoughMeatOnStock == true) {
                        meatCount = meatCount - order.get(Dish.BORSCH_DISH_NAME) * borsch.getMeatCount();
                    } else {
                        meatCountToOrder = order.get(Dish.BORSCH_DISH_NAME) * borsch.getMeatCount() - meatCount;
                    }

                    if (isEnoughCabbageOnStock == false || isEnoughTomatoesOnStock == false || isEnoughPotatoesOnStock == false || isEnoughBeetOnStock == false || isEnoughMeatOnStock == false) {
                        isEnoughProductsOnStock = false;
                    }

                    System.out.println("Client ordered " + Dish.BORSCH_DISH_NAME + " - " + order.get(Dish.BORSCH_DISH_NAME) + " portion");
                    System.out.println("To prepare it, you need:");
                    System.out.println(order.get(Dish.BORSCH_DISH_NAME)* borsch.getCabbageCount() + " cabbages");
                    System.out.println(order.get(Dish.BORSCH_DISH_NAME)* borsch.getTomatoesCount() + " tomatoes");
                    System.out.println(order.get(Dish.BORSCH_DISH_NAME)* borsch.getPotatoesCount() + " potatoes");
                    System.out.println(order.get(Dish.BORSCH_DISH_NAME)* borsch.getBeetCount() + " beets");
                    System.out.println(order.get(Dish.BORSCH_DISH_NAME)* borsch.getMeatCount() + " meat");
                    System.out.println();

                    if (isEnoughProductsOnStock == false) {
                        if (isEnoughCabbageOnStock == false) {
                            System.out.println("But you have not enough cabbages on your stock! You need " + cabbageCountToOrder + " more!");
                        }
                        if (isEnoughTomatoesOnStock ==false) {
                            System.out.println("But you have not enough tomatoes on your stock! You need " + tomatoesCountToOrder + " more!");
                        }
                        if (isEnoughPotatoesOnStock == false) {
                            System.out.println("But you have not enough potatoes on your stock! You need " + potatoesCountToOrder + " more!");
                        }
                        if (isEnoughBeetOnStock == false) {
                            System.out.println("But you have not enough potatoes on your stock! You need " + beetCountToOrder + " more!");
                        }
                        if (isEnoughMeatOnStock == false) {
                            System.out.println("But you have not enough potatoes on your stock! You need " + meatCountToOrder + " more!");
                        }
                        System.out.println();
                    }


                    iterator.remove();
                    break;

                case Dish.SALAD_DISH_NAME:

                    isEnoughProductsOnStock = true;

                    isEnoughCabbageOnStock = cabbageCount >= order.get(Dish.SALAD_DISH_NAME) * salad.getCabbageCount();
                    if (isEnoughCabbageOnStock == true) {
                        cabbageCount = cabbageCount - order.get(Dish.SALAD_DISH_NAME) * salad.getCabbageCount();
                    } else {
                        cabbageCountToOrder = order.get(Dish.SALAD_DISH_NAME) * salad.getCabbageCount() - cabbageCount;
                    }

                    isEnoughTomatoesOnStock = tomatoesCount >= order.get(Dish.SALAD_DISH_NAME) * salad.getTomatoesCount();
                    if (isEnoughTomatoesOnStock == true) {
                        tomatoesCount = tomatoesCount - order.get(Dish.SALAD_DISH_NAME) * salad.getTomatoesCount();
                    } else {
                        tomatoesCountToOrder = order.get(Dish.SALAD_DISH_NAME) * salad.getTomatoesCount() - tomatoesCount;
                    }

                    isEnoughOilOnStock = oilCount >= order.get(Dish.SALAD_DISH_NAME) * salad.getOilCount();
                    if (isEnoughOilOnStock == true) {
                        oilCount = oilCount - order.get(Dish.SALAD_DISH_NAME) * salad.getOilCount();
                    } else {
                        oilCountToOrder = order.get(Dish.SALAD_DISH_NAME) * salad.getOilCount() - oilCount;
                    }

                    isEnoughCucumberOnStock = cucumberCount >= order.get(Dish.SALAD_DISH_NAME) * salad.getCucumberCount();
                    if (isEnoughCucumberOnStock == true) {
                        cucumberCount = cucumberCount - order.get(Dish.SALAD_DISH_NAME) * salad.getCucumberCount();
                    } else {
                        cucumberCountToOrder = order.get(Dish.SALAD_DISH_NAME) * salad.getCucumberCount() - cucumberCount;
                    }

                    isEnoughOnionOnStock = onionCount >= order.get(Dish.SALAD_DISH_NAME) * salad.getOnionCount();
                    if (isEnoughOnionOnStock == true) {
                        onionCount = onionCount - order.get(Dish.SALAD_DISH_NAME) * salad.getOnionCount();
                    } else {
                        onionCountToOrder = order.get(Dish.SALAD_DISH_NAME) * salad.getOnionCount() - onionCount;
                    }

                    if (isEnoughCabbageOnStock == false || isEnoughTomatoesOnStock == false || isEnoughOilOnStock == false || isEnoughCucumberOnStock == false || isEnoughOnionOnStock == false) {
                        isEnoughProductsOnStock = false;
                    }

                    System.out.println("Client ordered " + Dish.SALAD_DISH_NAME + " - " + order.get(Dish.SALAD_DISH_NAME) + " portion");
                    System.out.println("To prepare it, you need:");
                    System.out.println(order.get(Dish.SALAD_DISH_NAME)* salad.getCabbageCount() + " cabbages");
                    System.out.println(order.get(Dish.SALAD_DISH_NAME)* salad.getTomatoesCount() + " tomatoes");
                    System.out.println(order.get(Dish.SALAD_DISH_NAME)* salad.getOilCount() + " oil");
                    System.out.println(order.get(Dish.SALAD_DISH_NAME)* salad.getOnionCount() + " onion");
                    System.out.println(order.get(Dish.SALAD_DISH_NAME)* salad.getCucumberCount() + " cucumber");
                    System.out.println();

                    if (isEnoughProductsOnStock == false) {
                        if (isEnoughCabbageOnStock == false) {
                            System.out.println("But you have not enough cabbages on your stock! You need " + cabbageCountToOrder + " more!");
                        }
                        if (isEnoughTomatoesOnStock ==false) {
                            System.out.println("But you have not enough tomatoes on your stock! You need " + tomatoesCountToOrder + " more!");
                        }
                        if (isEnoughOilOnStock == false) {
                            System.out.println("But you have not enough oil on your stock! You need " + oilCountToOrder + " more!");
                        }
                        if (isEnoughCucumberOnStock == false) {
                            System.out.println("But you have not enough cucumbers on your stock! You need " + cucumberCountToOrder + " more!");
                        }
                        if (isEnoughOnionOnStock == false) {
                            System.out.println("But you have not enough onions on your stock! You need " + onionCountToOrder + " more!");
                        }
                        System.out.println();
                    }

                    iterator.remove();
                    break;

                case Dish.FRIED_POTATOES_DISH_NAME:

                    isEnoughProductsOnStock = true;

                    isEnoughPotatoesOnStock = potatoesCount >= order.get(Dish.FRIED_POTATOES_DISH_NAME) * friedPotatos.getPotatoesCount();
                    if (isEnoughPotatoesOnStock == true) {
                        potatoesCount = potatoesCount - order.get(Dish.FRIED_POTATOES_DISH_NAME) * friedPotatos.getPotatoesCount();
                    } else {
                        potatoesCountToOrder = order.get(Dish.FRIED_POTATOES_DISH_NAME) * friedPotatos.getPotatoesCount() - potatoesCount;
                    }

                    isEnoughOilOnStock = oilCount >= order.get(Dish.FRIED_POTATOES_DISH_NAME) * friedPotatos.getOilCount();
                    if (isEnoughOilOnStock == true) {
                        oilCount = oilCount - order.get(Dish.FRIED_POTATOES_DISH_NAME) * friedPotatos.getOilCount();
                    } else {
                        oilCountToOrder = order.get(Dish.FRIED_POTATOES_DISH_NAME) * friedPotatos.getOilCount() - oilCount;
                    }

                    isEnoughOnionOnStock = onionCount >= order.get(Dish.FRIED_POTATOES_DISH_NAME) * friedPotatos.getOnionCount();
                    if (isEnoughOnionOnStock == true) {
                        onionCount = onionCount - order.get(Dish.FRIED_POTATOES_DISH_NAME) * friedPotatos.getOnionCount();
                    } else {
                        onionCountToOrder = order.get(Dish.FRIED_POTATOES_DISH_NAME) * friedPotatos.getOnionCount() - onionCount;
                    }

                    if (isEnoughPotatoesOnStock == false || isEnoughOilOnStock == false) {
                        isEnoughProductsOnStock = false;
                    }

                    System.out.println("Client ordered " + Dish.FRIED_POTATOES_DISH_NAME + " - " + order.get(Dish.FRIED_POTATOES_DISH_NAME) + " portion");
                    System.out.println("To prepare it, you need:");
                    System.out.println(order.get(Dish.FRIED_POTATOES_DISH_NAME)* friedPotatos.getOilCount() + " oil");
                    System.out.println(order.get(Dish.FRIED_POTATOES_DISH_NAME)* friedPotatos.getOnionCount() + " onion");
                    System.out.println(order.get(Dish.FRIED_POTATOES_DISH_NAME)* friedPotatos.getPotatoesCount() + " potatoes");
                    System.out.println();

                    if (isEnoughProductsOnStock == false) {
                        if (isEnoughOilOnStock == false) {
                            System.out.println("But you have not enough oil on your stock! You need " + oilCountToOrder + " more!");
                        }
                        if (isEnoughOnionOnStock == false) {
                            System.out.println("But you have not enough onions on your stock! You need " + onionCountToOrder + " more!");
                        }
                        if (isEnoughPotatoesOnStock == false) {
                            System.out.println("But you have not enough onions on your stock! You need " + potatoesCountToOrder + " more!");
                        }

                        System.out.println();
                    }
                    iterator.remove();
                    break;

                case Dish.FRIED_MEAT_DISH_NAME:

                    isEnoughProductsOnStock = true;

                    isEnoughMeatOnStock = meatCount >= order.get(Dish.FRIED_MEAT_DISH_NAME) * friedMeat.getFriedMeatCount();
                    if (isEnoughMeatOnStock == true) {
                        meatCount = meatCount - order.get(Dish.FRIED_MEAT_DISH_NAME) * friedMeat.getFriedMeatCount();
                    } else {
                        meatCountToOrder = order.get(Dish.FRIED_MEAT_DISH_NAME) * friedMeat.getFriedMeatCount() - meatCount;
                    }

                    isEnoughOilOnStock = oilCount >= order.get(Dish.FRIED_MEAT_DISH_NAME) * friedMeat.getOilCount();
                    if (isEnoughOilOnStock == true) {
                        oilCount = oilCount - order.get(Dish.FRIED_MEAT_DISH_NAME) * friedMeat.getOilCount();
                    } else {
                        oilCountToOrder = order.get(Dish.FRIED_MEAT_DISH_NAME) * friedMeat.getOilCount() - oilCount;
                    }

                    if (isEnoughMeatOnStock == false || isEnoughOilOnStock == false) {
                        isEnoughProductsOnStock = false;
                    }

                    System.out.println("Client ordered " + Dish.FRIED_MEAT_DISH_NAME + " - " + order.get(Dish.FRIED_MEAT_DISH_NAME) + " portion");
                    System.out.println("To prepare it, you need:");
                    System.out.println(order.get(Dish.FRIED_MEAT_DISH_NAME)* friedMeat.getOilCount() + " oil");
                    System.out.println(order.get(Dish.FRIED_MEAT_DISH_NAME)* friedMeat.getFriedMeatCount() + " meat");
                    System.out.println();

                    if (isEnoughProductsOnStock == false) {
                        if (isEnoughMeatOnStock == false) {
                            System.out.println("But you have not enough oil on your stock! You need " + meatCountToOrder + " more!");
                        }
                        if (isEnoughOilOnStock == false) {
                            System.out.println("But you have not enough onions on your stock! You need " + oilCountToOrder + " more!");
                        }
                        if (isEnoughPotatoesOnStock == false) {
                            System.out.println("But you have not enough onions on your stock! You need " + potatoesCountToOrder + " more!");
                        }

                        System.out.println();
                    }

                    iterator.remove();
                    break;
            }

        }
        return isEnoughProductsOnStock;
    }

    public boolean isEnoughProductsOnStock() {
        return isEnoughProductsOnStock;
    }

    public boolean isEnoughCucumberOnStock() {
        return isEnoughCucumberOnStock;
    }

    public int getCabbageCount() {
        return cabbageCount;
    }

    public void setCabbageCount(int cabbageCount) {
        this.cabbageCount = cabbageCount;
    }

    public int getTomatoesCount() {
        return tomatoesCount;
    }

    public void setTomatoCount(int tomatoCount) {
        this.tomatoesCount = tomatoCount;
    }

    public int getOilCount() {
        return oilCount;
    }

    public void setOilCount(int oilCount) {
        this.oilCount = oilCount;
    }

    public int getPotatoesCount() {
        return potatoesCount;
    }

    public void setPotatoesCount(int potatoesCount) {
        this.potatoesCount = potatoesCount;
    }

    public int getBeetCount() {
        return beetCount;
    }

    public void setBeetCount(int beetCount) {
        this.beetCount = beetCount;
    }

    public int getMeatCount() {
        return meatCount;
    }

    public void setMeatCount(int meatCount) {
        this.meatCount = meatCount;
    }

    public int getBunCount() {
        return bunCount;
    }

    public void setBunCount(int bunCount) {
        this.bunCount = bunCount;
    }

    public int getOnionCount() {
        return onionCount;
    }

    public void setOnionCount(int onionCount) {
        this.onionCount = onionCount;
    }

    public int getCucumberCount() {
        return cucumberCount;
    }

    public void setCucumberCount(int cucumberCount) {
        this.cucumberCount = cucumberCount;
    }


    public boolean isEnoughCabbageOnStock() {
        return isEnoughCabbageOnStock;
    }

    public boolean isEnoughTomatoesOnStock() {
        return isEnoughTomatoesOnStock;
    }

    public boolean isEnoughOilOnStock() {
        return isEnoughOilOnStock;
    }

    public boolean isEnoughPotatoesOnStock() {
        return isEnoughPotatoesOnStock;
    }

    public boolean isEnoughBeetOnStock() {
        return isEnoughBeetOnStock;
    }

    public boolean isEnoughMeatOnStock() {
        return isEnoughMeatOnStock;
    }

    public boolean isEnoughBunOnStock() {
        return isEnoughBunOnStock;
    }

    public boolean isEnoughOnionOnStock() {
        return isEnoughOnionOnStock;
    }

    public int getCabbageCountToOrder() {
        return cabbageCountToOrder;
    }

    public int getTomatoesCountToOrder() {
        return tomatoesCountToOrder;
    }

    public int getPotatoesCountToOrder() {
        return potatoesCountToOrder;
    }

    public int getBeetCountToOrder() {
        return beetCountToOrder;
    }

    public int getMeatCountToOrder() {
        return meatCountToOrder;
    }

    public int getBunCountToOrder() {
        return bunCountToOrder;
    }

    public int getOnionCountToOrder() {
        return onionCountToOrder;
    }

    public int getCucumberCountToOrder() {
        return cucumberCountToOrder;
    }

    public int getOilCountToOrder() {
        return oilCountToOrder;
    }
}
