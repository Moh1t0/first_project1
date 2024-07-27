package org.javaacademy.core.homework;
import java.util.Scanner;

public class Calc {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //1. Вывести на экран: Введите первое число
            System.out.println("Введите первое число: ");


            //2. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
            double number1 = scanner.nextDouble();


            //3. Вывести на экран: Введите знак операции - "+", "-", "*", "/"
            System.out.println("Введите знак операции - \"+\", \"-\", \"*\", \"/\"");


            //4. Получить текст с помощью scanner.nextLine(), сохранить его в переменную
            String symbol = scanner.next();


            //4. Вывести на экран: Введите второе число
            System.out.println("Введите второе число: ");


            //5. Получить число с помощью scanner.nextDouble(), сохранить его в переменную
            double number2 = scanner.nextDouble();


            //6. В зависимости от знака операции произвести соответствующую операцию. Вывести результат на экран.
            //Если знак операции не относится к перечисленным выше, вывести - "Ошибка"
            if (symbol.equals("+")) {
                System.out.println(number1 + number2);
            } else if (symbol.equals("-")) {
                System.out.println(number1 - number2);
            } else if (symbol.equals("*")) {
                System.out.println(number1 * number2);
            } else if (symbol.equals("/")) {
                System.out.println(number1 / number2);
            } else {
                System.out.println("Ошибка");
            }

            scanner.close();
        }
    }

