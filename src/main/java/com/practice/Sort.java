package com.practice;

public class Sort {
    public int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j;
            int buf = array[i];

            for (j = i - 1; j >= 0; j--) {
                if (array[j] < buf) {
                    break;
                }
                array[j + 1] = array[j];
            }

            array[j + 1] = buf;
        }
        return array;
    }

    public String[] insertionSort(String[] array) {
        for (int i = 1; i < array.length; i++) {
            int j;
            String buf = array[i];

            for (j = i - 1; j >= 0; j--) {
                if (array[j].compareTo(buf) < 0) {
                    break;
                }
                array[j + 1] = array[j];
            }

            array[j + 1] = buf;
        }
        return array;
    }
}
