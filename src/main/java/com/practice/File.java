package com.practice;

import java.io.*;
import java.util.ArrayList;

public class File {
    private ArrayList<Integer> listInt = new ArrayList<>();
    private ArrayList<String> listStr = new ArrayList<>();
    private java.io.File inputFileName;
    private java.io.File outputFileName;

    private static final java.io.File INPUT_FILE = new java.io.File("in.txt");
    private static final java.io.File OUTPUT_FILE = new java.io.File("out.txt");

    public ArrayList<Integer> getListInt() {
        return listInt;
    }

    public ArrayList<String> getListStr() {
        return listStr;
    }

    public void setInputFileName(String inputFileName) {
        this.inputFileName = new java.io.File(inputFileName);
    }

    public void setOutputFileName (String outputFileName) {
        this.outputFileName = new java.io.File(outputFileName);
    }

    /**
     * Считываем информацию с файла.
     * Помещаем её в listInt.
     */
    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(this.inputFileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (isNumber(line)) {
                    this.listInt.add(Integer.valueOf(line));
                } else {
                    this.listStr.add(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error input!");
            e.printStackTrace();
        }
    }

    private boolean isNumber(String line) {
        try {
            Integer.parseInt(line);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    /**
     * Сохраняем массив информации в файл.
     * @param out массив который мы записываем в файл.
     */
    public void save(int[] out) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.outputFileName))) {
            for (int i = 0; i < out.length; i++) {
                writer.write(String.valueOf(out[i]));
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(String[] out) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(this.outputFileName))) {
            for (int i = 0; i < out.length; i++) {
                writer.write(out[i]);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Получаем из listInt'а целочиселенный массив.
     * @return целочисленный массив который считали из файла.
     */
    public int[] getIntArray() {
        if (this.listInt.isEmpty()) {
            throw new NullPointerException("\nВыбран не верный параметр, " +
                    "файл содержит строки. " +
                    "Выберете -i -a (для целых чисел по возрастанию), либо " +
                    "выберете -i -d (для целых чисел по убыванию)");
        }
        int size = this.listInt.size();
        int[] inputArray = new int[size];

        for (int i = 0; i < inputArray.length; i++) {
            inputArray[i] = this.listInt.get(i);
        }
        return inputArray;
    }

    /**
     * Получаем массив из строк
     * @return строчный массив который считали из файла.
     */
    public String[] getStrArray() {
        if (this.listStr.isEmpty()) {
            throw new NullPointerException("\nВыбран не верный параметр, " +
                    "файл содержит целые числа. " +
                    "Выберете -s -a (для строк по возрастанию), либо " +
                    "выберете -s -d (для строк по убыванию)");
        }
        int size = this.listStr.size();
        String[] strings = new String[size];
        return this.listStr.toArray(strings);
    }

}
