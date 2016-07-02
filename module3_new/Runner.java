package com.goit.gojavaonline.module3_new;

/**
 * Created by ANTON on 23.06.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Person person = new Person();

        person.setAge(29);
        person.setName("Denis");

        System.out.println("Name = " + person.getName());
        System.out.println("Age = " + person.getAge());

    }
}
