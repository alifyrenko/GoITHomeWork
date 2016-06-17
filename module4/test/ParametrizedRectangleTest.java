package com.goit.gojavaonline.module4.test;

import com.goit.gojavaonline.module4.hw1.Rectangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ParametrizedRectangleTest {

    private int sideA;
    private int sideB;
    private int expected;

    public ParametrizedRectangleTest(int sideA, int sideB, int expected) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: calcArea = {0}*{1}={2}")
    public static Iterable<Object[]> getParametrized() {
        return Arrays.asList(new Object[][]{
                {5,10,50},
                {6,15,90},
                {7,16,112},
                {8,17,136}
        });
    }

    @Test (timeout = 3000)
    public void testCalcArea() throws Exception {

        Rectangle rectangle = new Rectangle(sideA,sideB);
        double result = rectangle.calcArea();

        Assert.assertEquals(expected, result, 0);
    }
}