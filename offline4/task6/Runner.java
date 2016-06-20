package com.goit.gojavaonline.offline4.task6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by ANTON on 19.06.2016.
 */
public class Runner {
    public static void main(String[] args) {

        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("Alex", 5));
        studentList.add(new Student("Bob", 4));
        studentList.add(new Student("Charlie", 4));
        studentList.add(new Student("Gregory", 1));
        studentList.add(new Student("Nikolas", 5));
        studentList.add(new Student("Ann", 3));

        StudentsPrinter studentsPrinter = new StudentsPrinter();
        studentsPrinter.printStudents(studentList,5);
    }
}

