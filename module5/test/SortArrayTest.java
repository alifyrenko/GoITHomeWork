package com.goit.gojavaonline.module5.test;

import com.goit.gojavaonline.module5.hw2.SortArray;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortArrayTest {

    @Test
    public void testSortArray(){

        int [] actual =   {5,45,89,-78,56,98,10,0,0,56,-78};
        int [] expected = {5,45,89,-78,56,98,10,0,0,56,-78};

        SortArray sortArray = new SortArray();
        sortArray.sort(actual);

        Arrays.sort(expected);

        assertArrayEquals(expected, actual);
    }

    @Test(expected = NullPointerException.class)
    public void SortArrayTestException () {
        int [] array = null;
        new SortArray().sort(array);
    }
}