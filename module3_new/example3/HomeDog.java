package com.goit.gojavaonline.module3_new.example3;

/**
 * Created by ANTON on 23.06.2016.
 */
public class HomeDog extends Dog {

    static {
        System.out.println("Static HomeDog1");
    }

    public HomeDog() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static HomeDog 1 ");
    }

    {
        System.out.println("block777 HomeDog1");
    }
    {
        System.out.println("block888 HomeDog1");
    }
}
