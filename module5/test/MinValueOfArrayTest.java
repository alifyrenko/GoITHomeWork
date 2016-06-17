package com.goit.gojavaonline.module5.test;

import com.goit.gojavaonline.module5.hw1.MinValueOfArray;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MinValueOfArrayTest {

    @Test
    public void testGetMinValueOfArray(){

        int [] arrayList = {-5,10,59,78,-30,0,10,40};

        Arrays.sort(arrayList);
        int expected = arrayList[0];

        int actual = new MinValueOfArray().getMinValueOfArray(arrayList);
        assertEquals(expected, actual, 1e-8);
    }

    @Test (expected = NullPointerException.class)
    public void MinValueOfArrayTestException(){

        int [] arrayList = null;
        new MinValueOfArray().getMinValueOfArray(arrayList);
    }

}