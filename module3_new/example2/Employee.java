package com.goit.gojavaonline.module3_new.example2;

/**
 * Created by ANTON on 23.06.2016.
 */
public class Employee {


    static {
        System.out.println("Static block1");
    }

    public Employee() {
        System.out.println("Constructor");
    }

    static {
        System.out.println("Static block2");
    }

    {
        System.out.println("Static block777");
    }
    {
        System.out.println("Static block888");
    }

}
