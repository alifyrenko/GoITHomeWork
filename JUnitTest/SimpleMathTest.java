package com.goit.gojavaonline.JUnitTest;

import com.goit.gojavaonline.module11.SimpleMath;
import org.junit.*;

import static org.junit.Assert.*;

public class SimpleMathTest {

    private static SimpleMath simpleMath;

    @BeforeClass
    public static void setUpClass() throws Exception {

        simpleMath = new SimpleMath();
        System.out.println("setUp method called!");
    }


    @Test (timeout = 3000)
    public void testAdd() throws Exception {

        int a = 5;
        int b = 10;

        final int result = simpleMath.add(a, b);
        Assert.assertEquals(a + b, result);
    }

    @Test (timeout = 3000)
    public void testSub() throws Exception {

        final int a = 10;
        final int b = 7;

        final int result = simpleMath.sub(a, b);
        Assert.assertEquals(a - b, result);
    }

    @Test (timeout = 3000)
    public void testModulo() throws Exception {

        final int a = 17;
        final int b = 3;

        final int result = simpleMath.modulo(a,b);
        assertEquals(a % b, result);

    }

    @Test(expected = UnsupportedOperationException.class)
    public void testDiv() throws Exception {
        final int a = 17;
        final int b = 3;

        final int result =  simpleMath.div(a,b);

    }
}