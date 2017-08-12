package com.practice;

import java.util.Arrays;

public class Main {
    // TODO релизовать сохранение, написать тесты.

    private Sort sort = new Sort();
    private File file = new File();
    private String[] sortingStrings;
    private int[] sortingInt;

    public void init(String[] args) {
        if (args.length != 0) {
            file.setInputFileName(args[0]);
            file.setOutputFileName(args[1]);
            if (args[0] != "" && args[1] != "") {
                file.load();
                typeOfContent(args);
            }
        } else {
            System.out.println("Введите правило запуска");
        }

    }

    public void typeOfContent(String[] args) {
        if (args[2].equals("-i")) {
            sortingModeInt(args);
        } else if (args[2].equals("-s")) {
            sortingModeStr(args);
        } else {
            System.out.println("Не верная команда!");
        }
    }

    private void sortingModeInt(String[] args) {
        if (args[3].equals("-a")) {
            this.sortingInt = sort.insertionSortIncrease(file.getIntArray());
        } else if (args[3].equals("-d")) {
            this.sortingInt = sort.insertionSortDecrease(file.getIntArray());
        } else {
            System.out.println("Не верная команда!");
        }

    }

    private void sortingModeStr(String[] args) {
        if (args[3].equals("-a")) {
            this.sortingStrings = sort.insertionSortIncrease(file.getStrArray());
        } else if (args[3].equals("-d")) {
            this.sortingStrings = sort.insertionSortDecrease(file.getStrArray());
        }
    }

    public int[] getSortingInt() {
        return sortingInt;
    }

    public String[] getSortingStrings() {
        return sortingStrings;
    }

    public static void main(String[] args) {

    }



}


