package com.goit.gojavaonline.offline4.task6;

import java.util.Iterator;
import java.util.List;

/**
 * Created by ANTON on 19.06.2016.
 */
public class StudentsPrinter {

    public void printStudents(List<Student> list, int course) {
        Iterator<Student> iterator = list.iterator();

        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (course == student.getCourse()) {
                System.out.println(student);
                iterator.next();
            } else {
                iterator.next();
            }
        }
    }
}
