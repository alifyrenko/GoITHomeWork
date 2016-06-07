package com.goit.gojavaonline.offline2;

/**
 * Created by ANTON on 06.06.2016.
 */
public abstract class Employee {

    protected double avSalary;
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    abstract double avSalaryCalc();

}
