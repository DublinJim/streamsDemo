package com.jamesMkeogh;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Bill", 156));
        students.add(new Student("Bob", 436));
        students.add(new Student("John", 52));
        students.add(new Student("Paddy", 176));
        List<Student> over100 = new ArrayList<>();
        System.out.println("-------------all students -----------");
        for (Student value : students) {
            System.out.println(value);
        }

        for (Student i : students) {
            if (i.iq >= 100) {
                over100.add(i);

            }
        }
        System.out.println("------------smart folks-------------");
        for (Student student : over100) {
            System.out.println(student);

        }

    }
}



