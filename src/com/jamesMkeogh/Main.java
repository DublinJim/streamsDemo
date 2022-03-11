package com.jamesMkeogh;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Bill", 56));
        students.add(new Student("Bob", 46));
        students.add(new Student("John", 5));
        students.add(new Student("Paddy", 76));
    }
}
