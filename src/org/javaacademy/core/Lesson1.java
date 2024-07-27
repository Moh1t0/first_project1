package org.javaacademy.core;

import java.sql.SQLOutput;
import java.sql.SQLTimeoutException;

public class Lesson1 {
    public static void main(String[] args) {
        System.out.println("Привет мир!");
        //1 - есть сигнал
        //0 - нет сигнала
        //bit - кусочек
        boolean hasSignal = true; //1
        boolean noSignal = false; //0

        //0 - 255
        byte minByte = 127;
        byte maxByte = -128;

        //-32_768 до 32_767 - 2 байта
        short minShort = 32_767;
        short maxShort = -32_768;

        //4 байта
        int maxInt = 2_147_483_647;
        int minInt = -2_147_483_648;

        long maxLong = 9_223_372_036_854_775_807L;
        long minLong = -9_223_372_036_854_775_808L;

        int number1 = 10;
        int number2 = 3;
        System.out.println("Операция сложения:" + (number1 + number2));
        int minusResult = number1 - number2;
        System.out.println("Операция вычитания:" + minusResult);
        System.out.println("Операция деления:" + (number1/number2));
        System.out.println("Операция умножения:" + (number1 * number2));

        //4 байта - 32 бита
        float dollarRate = 88.6F;
        System.out.println("Сколько знаков после запятой может быть: " + 1.1234567890F );
        //8 байт -  64 бита
        System.out.println("Сколько знаков после запятой может быть DOUBLE: " + 1.123456789012345678);

        System.out.println("_____________________");


        char randomSymbol = 'К';
        //136 = k
        //138 = m
        System.out .println("Печать символа: " + randomSymbol);

        String text = "Это какой то текст";
        System.out.println(text);

        //Перевести в нижний регистр
        System.out.println(text.toLowerCase());

        //Перевести в верхний регистр
        System.out.println(text.toUpperCase());

        //Поиск подстроки
        String name = "Иван";
        String nameLowerCase = name.toLowerCase(); //Имя в нижем регистре
        boolean isNameContains = nameLowerCase.contains("н");
        System.out.println(isNameContains);

        //Повторение текста n раз
        String nameFiftyTimes = (name + "\n").repeat(50);
        System.out.println(nameFiftyTimes);

        //Обрезка строки
        String anotherText = "Привет. Меня зовут Витя!";
        String substring = anotherText.substring(0, 6);
        System.out.println("Первые 6 символов из текста: " + substring);

        //Длина предложения
        int anotherTextLength = anotherText.length();
        System.out.println("Длина предложения: " + anotherTextLength);

        //Обрезка пробелов ( только в начале и конце текста)
        String textWithBlanks = "           этот текст с пробелами        ";
        String textWithoutBlanks = textWithBlanks.trim();
        System.out.println(textWithBlanks);

        //Объединение строк - конкатенация
        String firstName = "Иван";
        String secondName = "Костенко";
        System.out.println("Конкатенация:" + firstName + " " + secondName);
























    }
}
