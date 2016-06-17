package com.goit.gojavaonline.module4.test;

import com.goit.gojavaonline.module4.hw1.Triangle;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {


    @Test
    public void testCalcArea() {

        int sideA = 5;
        int sideB = 10;
        int sideC = 15;

        Triangle triangle = new Triangle(sideA, sideB, sideC);

        double halfPerimetr = (sideA + sideB + sideC) / 2;
        double expected = Math.sqrt((halfPerimetr - sideC) * (halfPerimetr - sideB) * (halfPerimetr - sideC));

        double result = triangle.calcArea();
        Assert.assertEquals(expected, result, 0.0000001);
    }

    @Test (expected = ArithmeticException.class)
    public void testCalcAreaException() throws Exception {
        int sideA = 0;
        int sideB = 5;
        int sideC = -6;

        Triangle triangle = new Triangle(sideA, sideB, sideC);
        double result = triangle.calcArea();
    }
}