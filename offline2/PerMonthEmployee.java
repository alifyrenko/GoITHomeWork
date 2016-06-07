package com.goit.gojavaonline.offline2;

/**
 * Created by ANTON on 06.06.2016.
 */
public class PerMonthEmployee extends Employee {

    public PerMonthEmployee(String name, double avSalary) {
        super(name);
        this.avSalary = avSalary;
    }

    @Override
    public double avSalaryCalc() {
        return avSalary ;
    }

}
