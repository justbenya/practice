package com.practice;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        new Main().insertionSort(new int[]{9, 2, 1, 5, 3});
    }

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
}


