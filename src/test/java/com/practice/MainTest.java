package com.practice;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void initTest() throws Exception {
        Main main = new Main();
        String[] array = new String[]{"in.txt", "out.txt", "-i", "-a"};
        main.init(array);
        assertEquals("[9, 12, 15, 234, 323, 4678]",
                Arrays.toString(main.getSortingInt()));

    }

}