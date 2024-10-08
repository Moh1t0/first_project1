package org.javaacademy.core.homework.homework2;

import java.util.Arrays;
import java.util.Random;

public class Homework2 {
    public static void main(String[] args) {
        ex1();
        ex2();
        ex3();
    }

    public static void ex1() {

        String[] words = {"Это", "шашлык", "на", "шампуре"};
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i].substring(0, words[i].length());
            if (i < words.length - 1) {
                result += "-";
            }
        }
        System.out.println(result);
    }

    public static void ex2() {

        int[][] arrayOfNumbers = new int[10][10];
        arrayOfNumbers[0] = new int[]{131, 1, 1, 1, 1, 1, 1, 1, 1, 102};
        arrayOfNumbers[1] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 93, 1};
        arrayOfNumbers[2] = new int[]{1, 1, 31, 1, 1, 1, 1, 81, 1, 1};
        arrayOfNumbers[3] = new int[]{1, 1, 1, 45, 1, 1, 77, 1, 1, 1};
        arrayOfNumbers[4] = new int[]{1, 1, 1, 1, 57, 67, 1, 1, 1, 1};
        arrayOfNumbers[5] = new int[]{1, 1, 1, 1, 533, 68, 1, 1, 1, 1};
        arrayOfNumbers[6] = new int[]{1, 1, 1, 40, 1, 1, 72, 1, 1, 1};
        arrayOfNumbers[7] = new int[]{1, 1, 30, 1, 1, 1, 1, 83, 1, 1};
        arrayOfNumbers[8] = new int[]{1, 20, 1, 1, 1, 1, 1, 1, 901, 1};
        arrayOfNumbers[9] = new int[]{10, 1, 1, 1, 1, 1, 1, 1, 1, 101};

        int leftUpToRightDownSum = 0;
        int leftDownToRightUpSum = 0;
        int sizeOfArray = arrayOfNumbers.length;

        for (int i = 0; i < sizeOfArray; i++) {
            leftUpToRightDownSum += arrayOfNumbers[i][i];
            leftDownToRightUpSum += arrayOfNumbers[i][sizeOfArray - 1 - i];
        }
        System.out.println("Сумма c левого верхнего угла к нижнему правому: " + leftUpToRightDownSum);
        System.out.println("Сумма c левого нижнего угла к верхнему правому: " + leftDownToRightUpSum);
    }

    public static void ex3() {

        Random random = new Random();
        int number = 0;
        int countAttemp = 0;

        while (number != 999) {
            number = random.nextInt(1000);
            countAttemp++;
        }
        System.out.println("Количество попыток: " + countAttemp);

    }

    public static void ex4() {

    }

}

