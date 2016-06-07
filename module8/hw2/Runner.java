package com.goit.gojavaonline.module8.hw2;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by ANTON on 07.06.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(5);
        set.add(10);
        set.add(-15);
        set.add(26);

        set.stream().forEach(p -> System.out.println(p));
    }
}
