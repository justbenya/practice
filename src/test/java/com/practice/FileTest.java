package com.practice;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class FileTest {
    @Test
    public void getIntArray() throws Exception {
    }

    @Test
    public void loadTest() throws Exception {
        // АБ, А, ААВ, Б, ААА, ААБ, АА in.txt
        File file = new File();

        file.load();

        assertEquals("[АБ, А, ААВ, Б, ААА, ААБ, АА]",
                Arrays.toString(file.getStrArray()));
    }

    @Test
    public void loadIntegerFile() throws Exception {
        // 323, 4678, 9, 234, 12, 15 in.txt
        File file = new File();
        file.load();
        assertEquals("[323, 4678, 9, 234, 12, 15]",
                Arrays.toString(file.getIntArray()));
    }

}