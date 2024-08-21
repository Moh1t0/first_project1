package org.javaacademy.core.lesson9.ex8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        String filename = "C:\\Users\\Moh1to\\IdeaProjects\\first_project1\\numbers.txt";
        File file = new File(filename);
        int countLine = 1;
        int totalSum = 0;
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            if (countLine % 2 != 0) {
                Integer number = Integer.valueOf(nextLine);
                totalSum += number;
            }
            countLine++;
        }
        System.out.println(totalSum);
        scanner.close();
    }
}
