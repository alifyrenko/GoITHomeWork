package com.goit.gojavaonline.module4.test;

import com.goit.gojavaonline.module4.hw1.Circle;
import org.junit.Test;

import static org.junit.Assert.*;

public class CircleTest {


    @Test
    public void testCalcAreaCircle(){
        int radius = 5;
        Circle circle = new Circle(radius);

        double expected = radius * radius * 3.14;
        double actual = circle.calcArea();

        assertEquals(expected, actual, 0.1);
    }

    @Test(expected = ArithmeticException.class)
    public void testCalcAreaCircleException(){
        int radius = -5;
        new Circle(radius).calcArea();
    }

}