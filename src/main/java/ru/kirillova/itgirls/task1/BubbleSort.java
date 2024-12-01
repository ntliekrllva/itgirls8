package ru.kirillova.itgirls.task1;

import java.util.ArrayList;

public class BubbleSort {
    public static void bubbleSort (ArrayList< Student > students) {
        int n = students.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (students.get(j).gpa < students.get(j + 1).gpa) {
                    Student swap = students.get(j);
                    students.set(j, students.get(j + 1));
                    students.set(j + 1, swap);
                }
            }
        }
    }
}
