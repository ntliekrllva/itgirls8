package ru.kirillova.itgirls.task2;

import java.util.Arrays;

public class QuickSort {
    String[] fruits = {"apple", "orange", "grape", "banana"};

    public static void quickSort(String[] name, int low, int high) {
        if (name.length == 0 || low >= high) return;
        String border = name[low + (high - low) / 2];
        int i = low, j = high;
        while (i <= j) {
            while (name[i].compareTo(border) < 0) {
                i++;
            }
            while (name[j].compareTo(border) > 0) {
                j--;
            }
            if (i <= j) {
                String swap = name[i];
                name[i] = name[j];
                name[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j) quickSort(name, low, j);
        if (high > i) quickSort(name, i, high);
    }

    public void printResult() {
        quickSort(fruits, 0, fruits.length - 1);
        System.out.println("Список фруктов: " + Arrays.toString(fruits));
    }
}


