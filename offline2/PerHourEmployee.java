package com.goit.gojavaonline.offline2;

import java.util.Scanner;

/**
 * Created by ANTON on 06.06.2016.
 */
public class PerHourEmployee extends Employee {

    private double hourRate;

    public PerHourEmployee(String name, double hourRate) {
        super(name);
        this.hourRate = hourRate;
        
    }

    public static final double AVE_DAYS_IN_MONTH = 20.8;
    public static final byte WORK_HOURS_PER_DAY = 8;

    Scanner scanner = new Scanner(System.in);

    @Override
    public double avSalaryCalc() {
        System.out.println("Please, enter hour rate for employee with float salary!");

        avSalary = AVE_DAYS_IN_MONTH * WORK_HOURS_PER_DAY * hourRate;
        return avSalary;
    }
}
