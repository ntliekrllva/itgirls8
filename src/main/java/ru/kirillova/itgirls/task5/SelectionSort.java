package ru.kirillova.itgirls.task5;

import java.util.Arrays;

public class SelectionSort {
    String[] arr = {
            "5+6+32=43",
            "1+1=2",
            "(3+5)*4*21=483",
            "((21-20)*(32-30))/2=1"
    };

    private static int countOperations(String arr) {
        int count = 0;
        for (int  i = 0; i < arr.length(); i++) {
            char ch = arr.charAt(i);
            if (ch == '+' || ch == '-' || ch == '*' || ch == '/') {
                count++;
            }
        }
        return count;
    }

    public static void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minId = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (countOperations(arr[j]) < countOperations(arr[minId])) {
                    minId = j;
                }
            }
            String temp = arr[i];
            arr[i] = arr[minId];
            arr[minId] = temp;
        }
    }

    public void printSelectionSort() {
        selectionSort(arr);
        System.out.println("Формулы " + Arrays.toString(arr));
    }
}
