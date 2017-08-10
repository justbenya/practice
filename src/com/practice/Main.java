package com.practice;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Main go = new Main();
        File file = new File();
        file.load();
        System.out.println(file.getListStr());
        System.out.println(Arrays.toString(file.getInputDataString()));
        System.out.println(Arrays.toString(go.insertionSort(file.getInputDataString())));

//        int[] array = file.getInputData();
//        int[] result = go.insertionSort(array);
//        System.out.println(Arrays.toString(result));
//        file.save(result);
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


