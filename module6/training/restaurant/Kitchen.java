package com.goit.gojavaonline.module6.training.restaurant;

import java.util.Map;

/**
 * Created by ANTON on 03.06.2016.
 */
public class Kitchen {

    Stock stock;

    public void prepareDishes(Map<String, Integer> order) {
        stock.isEnoughProductsOnStock(order);
        }
    }

