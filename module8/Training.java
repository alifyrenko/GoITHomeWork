package com.goit.gojavaonline.module8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ANTON on 06.06.2016.
 */
public class Training {
    public static void main(String[] args) {

        final List<Person> personList = new ArrayList<>();
        personList.add(new Person("Anton", "Lifyrenko", (byte)27));
        personList.add(new Person("Sergey", "Lifyrenko", (byte)31));
        personList.add(new Person("Nikolay", "Lifyrenko", (byte)55));

        personList
                .stream()
                .map(person -> person.getFirstName())
                .forEach(firstName -> System.out.println(firstName));
    }
}
