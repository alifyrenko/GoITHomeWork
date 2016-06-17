package com.goit.gojavaonline.module4.test;

import com.goit.gojavaonline.module4.hw1.Rectangle;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testCalcAreaRectangle () {

        int sideA = 10;
        int sideB = 15;

        Rectangle rectangle = new Rectangle(sideA, sideB);

        double expected = sideA*sideB;
        double actual = rectangle.calcArea();
        assertEquals(expected, actual, 0.00001);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalcAreaRectangleException () {

        int sideA = -5;
        int sideB = 10;

        Rectangle rectangle = new Rectangle(sideA, sideB);
        rectangle.calcArea();
    }

}