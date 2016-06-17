package com.goit.gojavaonline.module4.test;

import com.goit.gojavaonline.module4.hw1.Circle;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ParametrizedCircleTest {

    private int radius;
    private double pi;
    private double expected;

    public ParametrizedCircleTest(int radius, double pi, double expected) {
        this.radius = radius;
        this.pi = pi;
        this.expected = expected;
    }

    @Parameterized.Parameters (name = "{index}: calcArea({0}*{0}*{1})={2}")
    public static Iterable<Object[]> getParametrized() {
        return Arrays.asList(new Object[][]{
            {5,  Math.PI, 5 * 5 * 3.142},
            {6,  Math.PI, 6 * 6 * 3.142},
            {15, Math.PI, 15 * 15 * 3.142}
        });
    }

    @Test (timeout = 3000)
    public void testCircle() throws Exception {

        double result = new Circle(radius).calcArea();
        Assert.assertEquals(expected, result, 0.1);
    }
}