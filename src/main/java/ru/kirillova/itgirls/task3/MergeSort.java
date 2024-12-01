package ru.kirillova.itgirls.task3;

import java.util.Arrays;

public class MergeSort {
    String[] names = {"cat", "orange", "elephant", "bird"};

    public static void mergeSort(String[] arr) {
        String[] buffer1 = Arrays.copyOf(arr, arr.length);
        String[] buffer2 = new String[arr.length];
        mergeSortInner(buffer1, buffer2, 0, arr.length);
    }

    public static void mergeSortInner(String[] buffer1, String[] buffer2, int startIndex, int endIndex) {
        if (startIndex >= endIndex - 1) {
            return;
        }

        int middle = startIndex + (endIndex - startIndex) / 2;
        mergeSortInner(buffer1, buffer2, startIndex, middle);
        mergeSortInner(buffer1, buffer2, middle, endIndex);

        int index1 = startIndex;
        int index2 = middle;
        int destIndex = startIndex;
        while (index1 < middle && index2 < endIndex) {
            if (buffer1[index1].length() <= buffer1[index2].length()) {
                buffer2[destIndex] = buffer1[index1];
                index1++;
                destIndex++;
            } else {
                buffer2[destIndex++] = buffer1[index2++];
            }
        }

        while (index1 < middle) {
            buffer2[destIndex] = buffer1[index1];
            index1++;
            destIndex++;
        }

        while (index2 < endIndex) {
            buffer2[destIndex] = buffer1[index2];
            index2++;
            destIndex++;
        }
    }

    public void printMergeSort() {
        mergeSort(names);
        System.out.println("Названия: " + Arrays.toString(names));
    }
}

