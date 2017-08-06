package com.practice;

import java.io.*;
import java.util.ArrayList;

public class File {
    private ArrayList<Integer> list = new ArrayList<>();

    private static final java.io.File INPUT_FILE = new java.io.File("in.txt");
    private static final java.io.File OUTPUT_FILE = new java.io.File("out.txt");

    public ArrayList<Integer> getList() {
        return list;
    }

    /**
     * Считываем информацию с файла.
     * Помещаем её в list.
     */
    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                this.list.add(Integer.valueOf(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Сохраняем массив информации в файл.
     * @param out массив который мы записываем в файл.
     */
    public void save(int[] out) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            for (int i = 0; i < out.length; i++) {
                writer.write(String.valueOf(out[i]));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Получаем из list'а целочиселенный массив.
     * @return целочисленный массив который считали из файла.
     */
    public int[] getInputData() {
        int[] inputArray = new int[this.list.size()];
        for (int i = 0; i < this.list.size(); i++) {
            inputArray[i] = this.list.get(i);
        }
        return inputArray;
    }
}
