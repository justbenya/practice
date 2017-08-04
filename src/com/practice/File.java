package com.practice;

import java.io.*;
import java.util.ArrayList;

public class File {
    private ArrayList<String> list = new ArrayList<>();
    private static final java.io.File INPUT_FILE = new java.io.File("in.txt");
    private static final java.io.File OUTPUT_FILE = new java.io.File("out.txt");

    public ArrayList<String> getList() {
        return list;
    }

    public void load() {
        try (BufferedReader reader = new BufferedReader(new FileReader(INPUT_FILE))) {
            String line;
            while ((line = reader.readLine()) != null) {
                list.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void save(String out) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(OUTPUT_FILE))) {
            writer.write(out);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
