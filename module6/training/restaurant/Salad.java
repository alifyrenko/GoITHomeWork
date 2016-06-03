package com.goit.gojavaonline.module6.training.restaurant;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ANTON on 03.06.2016.
 */
public class Salad extends Dish{

    @Override
    void prepareDish() {
        Map<String,Integer> recipe = new HashMap<>();
        recipe.put(Products.TOMATO, 1);
        recipe.put(Products.CUCUMBER, 2);
        recipe.put(Products.ONION, 2);
        recipe.put(Products.CABBAGE, 2);
    }
}
