package com.goit.gojavaonline.module11;

/**
 * Created by ANTON on 16.06.2016.
 */
public class SimpleMath {

    public int add(final int numA, final int numB) {
        return numA + numB;
    }

    public int sub(final int numA, final int numB) {
        return numA - numB;
    }

    public int modulo (final int numA, final int numB){
        int modulo = numA;

        while (modulo >= numB){
            modulo -= numB;
        }
        return modulo;
    }

    public int div (final int a, final int b){
        throw new UnsupportedOperationException("Div operation is not implemented yet");
    }

    public int multiply(final int numA, final int numB) {
        return numA * numB;
    }

}
