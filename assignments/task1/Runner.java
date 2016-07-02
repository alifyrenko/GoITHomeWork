package com.goit.gojavaonline.assignments.task1;


/**
 * Created by ANTON on 01.07.2016.
 */
public class Runner {
    public static void main(String[] args) {


    MyArrayList list = new MyArrayList();

       list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);

        list.add(3,10);

        System.out.println(list.get(3));

        System.out.println(list.size());

        System.out.println(list.isEmpty());

    }
}
