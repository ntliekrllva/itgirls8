package ru.kirillova.itgirls.task4;


import java.util.Arrays;

public class InsertionSort {
    String[] names = {"cat", "orange", "elephant", "bird"};

    public static int countVowel(String s) {
        String vowel = "aeoi";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (vowel.indexOf(ch) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int vowelCount = countVowel(arr[i]);
            String current = arr[i];
            int j = i - 1;
            while (j >= 0 && countVowel(arr[j]) < vowelCount) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = current;
        }
    }

    public void printInsertionSort() {
        insertionSort(names);
        System.out.println("Сортировка по гласным " + Arrays.toString(names));
    }
}
