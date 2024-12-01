package ru.kirillova.itgirls.task1;

import java.util.ArrayList;

public class Student {
    String surname;
    double gpa;

    public Student(String surname, double gpa) {
        this.surname = surname;
        this.gpa = gpa;

    }

    public String toString() {
        return surname + ": " + gpa;
    }
}
