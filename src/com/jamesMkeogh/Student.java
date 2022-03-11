package com.jamesMkeogh;

public class Student {
    String name;
    int iq;

    public Student(String name, int iq) {
        this.name = name;
        this.iq = iq;
    }

    public String getName() {
        return name;
    }

    public int getIq() {
        return iq;
    }


    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", iq=" + iq +
            '}';
    }
}
