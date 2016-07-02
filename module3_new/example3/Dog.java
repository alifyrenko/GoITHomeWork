package com.goit.gojavaonline.module3_new.example3;

/**
 * Created by ANTON on 23.06.2016.
 */
public class Dog {

    static {
        System.out.println("Static dog1");
    }

    public Dog() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static block2");
    }

    {
        System.out.println("block777");
    }
    {
        System.out.println("block888");
    }
}
