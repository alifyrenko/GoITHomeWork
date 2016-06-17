package com.goit.gojavaonline.JUnitTest;

import com.goit.gojavaonline.module11.SimpleMath;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.junit.Assert.*;

@RunWith(value = Parameterized.class)
public class ParametrizedSimpleMathTest {

    private final SimpleMath simpleMath = new SimpleMath();
    private int numberA;
    private int numberB;
    private int expected;

    public ParametrizedSimpleMathTest(int numberA, int numberB, int expected) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.expected = expected;
    }

    @Parameterized.Parameters(name = "{index}: multiply({0}*{1})={2}")
    public static Iterable<Object[]> getParametrized() {
        return Arrays.asList(new Object[][]{
                {1, 1, 1},
                {5, 10, 50},
                {10, 14, 140},
                {7, 8, 56},
        });
    }

    @Test
    public void testMultiply() throws Exception {
        Assert.assertEquals(expected, simpleMath.multiply(numberA, numberB));
    }
}