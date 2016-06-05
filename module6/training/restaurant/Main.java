package com.goit.gojavaonline.module6.training.restaurant;

import com.goit.gojavaonline.module6.hw3.NegativeValueException;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ANTON on 03.06.2016.
 */
public class Main {
    public static void main(String[] args) throws NegativeValueException {

        Stock stock = new Stock(100,100,100,100,100,100,100,100,100);

        Map<String, Integer> order = new HashMap<>();

            order.put(Dish.BORSCH_DISH_NAME, 1);
            order.put(Dish.FRIED_MEAT_DISH_NAME, 1);

            stock.isEnoughProductsOnStock(order);

            order.put(Dish.BORSCH_DISH_NAME, 50);
            order.put(Dish.FRIED_MEAT_DISH_NAME, 2);
            order.put(Dish.SALAD_DISH_NAME, 200);

            stock.isEnoughProductsOnStock(order);

            order.put(Dish.FRIED_MEAT_DISH_NAME, 100);
            order.put(Dish.FRIED_POTATOES_DISH_NAME, 70);

            stock.isEnoughProductsOnStock(order);

    }
}

