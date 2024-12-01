package ru.kirillova.itgirls.main;


import ru.kirillova.itgirls.task1.BubbleSort;
import ru.kirillova.itgirls.task1.Student;
import ru.kirillova.itgirls.task2.QuickSort;
import ru.kirillova.itgirls.task3.MergeSort;
import ru.kirillova.itgirls.task4.InsertionSort;
import ru.kirillova.itgirls.task5.SelectionSort;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Иванов", 4.5);
        Student st2 = new Student("Петров", 3.7);
        Student st3 = new Student("Сидоров", 4.2);
        Student st4 = new Student("Козлов", 5.0);
        Student st5 = new Student("Смирнов", 3.9);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);
        BubbleSort.bubbleSort(students);
        System.out.println("Список студентов: ");
        for (Student student : students) {
            System.out.println(student);
        }

        QuickSort quickSort = new QuickSort();
        quickSort.printResult();

        MergeSort mergeSort = new MergeSort();
        mergeSort.printMergeSort();

        InsertionSort insertionSort = new InsertionSort();
        insertionSort.printInsertionSort();

        SelectionSort selectionSort = new SelectionSort();
        selectionSort.printSelectionSort();
    }
}
