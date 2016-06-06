package com.goit.gojavaonline.offline2;

/**
 * Created by ANTON on 06.06.2016.
 */
public class Runner {
    public static void main(String[] args) {

        PerMonthEmployee perMonthEmployee = new PerMonthEmployee("Bob", 10000);
        PerHourEmployee perHourEmployee = new PerHourEmployee("Jeck", 50.0);

        System.out.println("Salary of employee with fixed salary = " + perMonthEmployee.avSalaryCalc());
        System.out.println("Salary of employee with float salary = " + perHourEmployee.avSalaryCalc());
    }
}
