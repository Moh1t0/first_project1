package org.javaacademy.core.homework.homework5;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        ex1();
    }

    private static void ex1() {
        //Донаты со всего мира
        //Одному блогеру присылают пожертвования(донаты) за его ролики
        //Данные о пожертвованиях содержатся в файле donation.csv (папка resources)
        //Необходимо посчитать сумму пожертвований от пользователей из каждой страны
        //Если сумма написана некорректно, то программа должна пропускать строчку (не завершать работу)
        String[] countries = {"Россия", "Франция", "Китай", "Япония", "Турция"};

        BigDecimal[] donations = {BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO, BigDecimal.ZERO};
        String filename = "donation.csv";
        //Чтение файла из папки resources (без привязки к конкретному расположению проекта)
        Scanner scanner = new Scanner(Runner.class.getClassLoader().getResourceAsStream(filename));
        System.out.println(scanner.nextLine());
        BigDecimal bigDecimal = BigDecimal.ZERO;
        Double temp = 0.0;
        String a = "";

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(";");
            a = parts[1].replace(',', '.');

            try {
                temp = Double.valueOf(a);
                bigDecimal = BigDecimal.valueOf(temp);
            } catch (Exception e) {

            }

            for (int i = 0; i < countries.length; i++) {
                if (line.startsWith(countries[i])) {
                    donations[i] = donations[i].add(bigDecimal);
                }
            }

        }
        for (int i = 0; i < countries.length; i++) {
            if (donations[i].equals(bigDecimal.ZERO)) {
                continue;
            }
            System.out.println(countries[i] + " - " + donations[i]);
        }

        //Ожидаемый вывод:
        //Список пожертвований по странам (пример):
        //Россия - 14233.00
        //Франция - 8000.32
        //Китай - 20000.11
        //Япония - 124.10
        //Турция - 777.55
    }

    private static void ex2() {
        //Сделать компьютерного шпиона
        //Смысл задания - отслеживать действия реального объекта и записывать их в лог
        //Создать компьютер:
        //1. Компьютер хранит в себе пользователя, который вошел в компьютер
        //2. Компьютер умеет:
        //2.3. Отправляет сообщение (на вход текст сообщения).
        // Печатает на экран "сообщение: {текст сообщения}".

        //Создать компьютерного шпиона, который наследуется от компьютера,
        // при этом хранит в себе обычный компьютер
        //Сделать так, чтобы при вызове методов компьютерного шпиона:
        //1. При входе пользователя делалась запись в comp.log "Пользователь {имя пользователя} вошел"
        // и вызывался метод компьютера.
        //2. При выходе делалась запись в comp.log "Пользователь вышел"
        //3. При отправке сообщения, делалась запись в comp.log:
        // "Пользователь {имя пользователя} отправил сообщение {текст сообщения}"
        // и вызвался метод компьютера.

        //Создать Runner
        //1. В нем создать компьютер.
        //2. Создать шпиона с компьютером из пункта 1
        //3. Сделать вход пользователя, отправку сообщения, выход пользователя через компьютерного шпиона.
        //4. Проверить наличие логов в comp.log
        // (файл должен быть внутри репозитория и отправлен в удаленное репо)
    }
}
