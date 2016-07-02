package com.goit.gojavaonline.assignments.task1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ANTON on 02.07.2016.
 */
public class MyArrayList {
   static int size = 0;
   static int [] array = new int[size];

    public void add(int index, int elem){
         array[index] = elem;
    }

    public void add(int elem){
        int [] arrayNew = new int[array.length+1];

        if(array.length == 0){
            arrayNew[0] = elem;
            array = arrayNew;
        } else {
            for (int i = 0; i < arrayNew.length-1; i++) {
                arrayNew[i] = array[i];
            }
            arrayNew[arrayNew.length-1] = elem;
            array = arrayNew;
        }
    }

    public int get (int index){
        return array[index];
    }

    public int size(){
       return array.length;
    }

    public boolean isEmpty(){
        return  array.length == 0 ? true:false;
    }
}
