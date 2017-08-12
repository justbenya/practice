package com.practice;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortTest {
    @Test
    public void insertionSortDecreaseInteger() throws Exception {
        int[] array = new int[]{4678, 12, 234, 323, 9, 15};

        Sort sort = new Sort();
        assertEquals("[4678, 323, 234, 15, 12, 9]",
                Arrays.toString(sort.insertionSortDecrease(array)));
    }

    @Test
    public void insertionSortIncreaseInteger() throws Exception {
        int[] array = new int[]{4678, 12, 234, 323, 9, 15};

        Sort sort = new Sort();
        assertEquals("[9, 12, 15, 234, 323, 4678]",
                Arrays.toString(sort.insertionSortIncrease(array)));
    }

    @Test
    public void insertionSortDecreaseString() throws Exception {
        String[] array = new String[]{"АБ", "А", "ААВ", "Б", "ААА", "ААБ", "АА"};

        Sort sort = new Sort();
        assertEquals("[Б, АБ, ААВ, ААБ, ААА, АА, А]",
                Arrays.toString(sort.insertionSortDecrease(array)));
    }

    @Test
    public void insertionSortIncreaseString() throws Exception {
        String[] array = new String[]{"АБ", "А", "ААВ", "Б", "ААА", "ААБ", "АА"};
        String[] array2 = new String[]{"Б", "АБ", "ААВ", "ААБ", "ААА", "АА", "А"};

        Sort sort = new Sort();
        assertEquals("[А, АА, ААА, ААБ, ААВ, АБ, Б]",
                Arrays.toString(sort.insertionSortIncrease(array)));
        assertEquals("[А, АА, ААА, ААБ, ААВ, АБ, Б]",
                Arrays.toString(sort.insertionSortIncrease(array2)));
    }


}