package com.goit.gojavaonline.module5.test;

import com.goit.gojavaonline.module5.hw1.MaxValueOfArray;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import static org.junit.Assert.*;

public class MaxValueOfArrayTest {


    @Test
    public void testGetMaxValueOfArray(){

       int [] arrayList = {-5,10,59,78,159,0,10,40};

        Arrays.sort(arrayList);
        int expected = arrayList[arrayList.length-1];

        int actual = new MaxValueOfArray().getMaxValueOfArray(arrayList);
        assertEquals(expected, actual, 1e-8);
    }

    @Test (expected = NullPointerException.class)
    public void MaxValueOfArrayTestException(){

        int [] arrayList = null;
        new MaxValueOfArray().getMaxValueOfArray(arrayList);
    }

}