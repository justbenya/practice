package com.practice;

/**
 * Класс для сортировки целых чисел по возрастанию, убыванию
 * для сортировки строк по возрастанию, убыванию.
 */
public class Sort {

    public int[] insertionSortIncrease(int[] array) {
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

    public int[] insertionSortDecrease(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j;
            int buf = array[i];

            for (j = i - 1; j >= 0; j--) {
                if (array[j] > buf) {
                    break;
                }
                array[j + 1] = array[j];
            }

            array[j + 1] = buf;
        }
        return array;
    }

    public String[] insertionSortIncrease(String[] array) {
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

    public String[] insertionSortDecrease(String[] array) {
        for (int i = 1; i < array.length; i++) {
            int j;
            String buf = array[i];

            for (j = i - 1; j >= 0; j--) {
                if (array[j].compareTo(buf) > 0) {
                    break;
                }
                array[j + 1] = array[j];
            }

            array[j + 1] = buf;
        }
        return array;
    }
}
