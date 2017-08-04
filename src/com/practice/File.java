package com.practice;

import java.io.*;
import java.util.ArrayList;

public class File {
    private static final java.io.File URL = new java.io.File("file1.txt");
    private ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> getList() {
        return list;
    }

    public void loadFile() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(URL));
            String line;
            while ( (line = reader.readLine() ) != null) {
                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file = new File();
        file.loadFile();
        System.out.println(file.getList());

    }
}
