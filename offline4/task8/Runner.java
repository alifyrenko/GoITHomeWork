package com.goit.gojavaonline.offline4.task8;

import java.util.*;

/**
 * Created by ANTON on 19.06.2016.
 */
public class Runner {
    public static void main(String[] args) {

        List<Integer> linkedList = new LinkedList<>();
        List<Integer> arrayList = new ArrayList<>();
        Set<Integer> treeSet = new TreeSet<>();
        Set<Integer> hashSet = new HashSet<>();


        long start = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.add(i);
        }
        long finish = System.nanoTime();
        System.out.println("Add linkedList => " + (finish - start));


        long start1 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        long finish1 = System.nanoTime();
        System.out.println("Add arrayList => " + (finish1 - start1));

        long start2 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treeSet.add(i);
        }
        long finish2 = System.nanoTime();
        System.out.println("Add treeSet => " + (finish2 - start2));


        long start3 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            hashSet.add(i);
        }
        long finish3 = System.nanoTime();
        System.out.println("Add hashSet => " + (finish3 - start3));

        ///////////////////////////


        long start4 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.remove(0);
        }
        long finish4 = System.nanoTime();
        System.out.println("Remove linkedList => " + (finish4 - start4));


        long start5 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.remove(0);
        }
        long finish5 = System.nanoTime();
        System.out.println("Remove arrayList => " + (finish5 - start5));

        long start6 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treeSet.remove(i);
        }
        long finish6 = System.nanoTime();
        System.out.println("Remove treeSet => " + (finish6 - start6));


        long start7 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            hashSet.remove(i);
        }
        long finish7 = System.nanoTime();
        System.out.println("Remove hashSet => " + (finish7 - start7));

        //////////////////////////////////////////


        long start8 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            linkedList.contains(i);
        }
        long finish8 = System.nanoTime();
        System.out.println("Search linkedList => " + (finish8 - start8));


        long start9 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.contains(i);
        }
        long finish9 = System.nanoTime();
        System.out.println("Search arrayList => " + (finish9 - start9));

        long start10 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            treeSet.contains(i);
        }
        long finish10 = System.nanoTime();
        System.out.println("Search treeSet => " + (finish10 - start10));


        long start11 = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            hashSet.contains(i);
        }
        long finish11 = System.nanoTime();
        System.out.println("Search hashSet => " + (finish11 - start11));

    }
}
