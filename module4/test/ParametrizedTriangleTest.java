package com.goit.gojavaonline.module4.test;

import com.goit.gojavaonline.module4.hw1.Triangle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ParametrizedTriangleTest {

    private int sideA;
    private int sideB;
    private int sideC;
    private double expected;

    public ParametrizedTriangleTest(int sideA, int sideB, int sideC, double expected) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: calcArea = TriangleAreaFormula")
    public static Iterable<Object[]> getParametrized () {
        return Arrays.asList(new Object[][]{
                {5,8,9,19.89},
                {6,7,8,15.49},
                {7,6,3,8.94},
                {8,5,6,10.39}
        });
    }

    @Test (timeout = 3000)
    public void testCalcArea() throws Exception {
        Triangle triangle = new Triangle(sideA, sideB, sideC);
        double result = triangle.calcArea();

        Assert.assertEquals(expected, result, 0.0001);

    }
}