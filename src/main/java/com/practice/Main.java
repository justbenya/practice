package com.practice;

import java.util.Arrays;

public class Main {

    private final Sort sort;
    private final File file;

    public Main() {
        this.sort = new Sort();
        this.file = new File();
    }

    public void init(String[] args) {
        if (args.length != 0) {
            file.setInputFileName(args[0]);
            file.setOutputFileName(args[1]);
            if (args[0] != "" && args[1] != "") {
                file.load();
                typeOfContent(args);
            }
        } else {
            System.out.println("Введите правило запуска:\n" +
                    "in.txt out.txt -i -a (для целых чисел по возрастанию)\n" +
                    "in.txt out.txt -i -d (для целых чисел по убыванию)\n" +
                    "in.txt out.txt -s -a (для строк по возрастанию)\n" +
                    "in.txt out.txt -s -a (для строк по убыванию)");
        }
    }

    private void typeOfContent(String[] args) {
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
            file.save(sort.insertionSortIncrease(file.getIntArray()));
        } else if (args[3].equals("-d")) {
            file.save(sort.insertionSortDecrease(file.getIntArray()));
        } else {
            System.out.println("Не верная команда!");
        }
    }

    private void sortingModeStr(String[] args) {
        if (args[3].equals("-a")) {
            file.save(sort.insertionSortIncrease(file.getStrArray()));
        } else if (args[3].equals("-d")) {
            file.save(sort.insertionSortDecrease(file.getStrArray()));
        } else {
            System.out.println("Не верная команда!");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.init(args);
    }

}


