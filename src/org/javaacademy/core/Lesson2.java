package org.javaacademy.core;

import java.sql.SQLOutput;

public class Lesson2 {
    public static void main(String[] args) {
        int money =  60;
        boolean isBlackBread = false;
        //boolean result = money > 100;
        if (money > 100) {
            if (isBlackBread) {
                System.out.println("Покупаю дорогой черный хлеб");
            } else {
                System.out.println("Покушаю дорогой белый хлеб");
            }
        } else if (money > 50) {
            if (isBlackBread) {
                System.out.println("Покупаю нормальный черный хлеб");
            } else {
                System.out.println("Покупаю нормальный хлеб");
            }
        } else {
            System.out.println("Покупаю дешевый хлеб");
        }


        //Операторы числового сравнения
        // > - больше
        // < - меньше
        // >= - больше или равно
        // <= - меньше или равно
        // == - равно
        // != - не равно

        int money2 = 150; // Количество моих денег
        int priceBread = 120; //Стоимость хлеба
        int priceWater = 20; //Стоимость воды

        if ( (priceWater + priceBread) <= money2 ) {
            System.out.println("Покупаю воду и хлеб");
        } else {
            System.out.println("Ничего не покупаю");
        }
        System.out.println("______________________________________________");

        //Логическое или  - ||
        //Если true или(||) true -> true
        //Если true или(||) false -> true
        //Если false или(||) false -> false

        int priceBread2 = 90; //Стоимость хлеба
        int priceWater2 = 16; //Стоимость воды
        if (priceBread2 > 100 || priceWater2 > 15) {
            System.out.println("Выхожу из магазина, у вас дорого!");
        } else {
            System.out.println("Покупаю товар");
        }


        //Логическое и  - &&
        //Если true и(&&) true -> true
        //Если true и(&&) false -> false
        //Если false и(&&) false -> false
        if (priceBread2 > 110 && priceBread2 < 120) {
            System.out.println("Есть хлеб от 110 до 120");
        } else {
            System.out.println("Нет хлеба от 110 до 120");
        }

        System.out.println("________________________________________");

        boolean isRedcar = false;
        boolean isCar = true;

        if (isRedcar || isCar) {
            System.out.println("У тебя есть что то красное  или красная машинка, я с тобой дружу");
        } else {
            System.out.println("У тебя нет красной машинки, я с тобой не  дружу");
        }

        System.out.println("______________________________________________");

        boolean isOlderThan18 = true;
        if (!isOlderThan18) {
            System.out.println("Я Старше 18");
        } else {
            System.out.println("Я младше или равно 18 ");
        }
        System.out.println("______________________________________");
        String name1 = "Иван";
        String name2 = "Иван Костенко";
        if (name1.equals(name2)) {
            System.out.println("Имена равны");
        } else {
            System.out.println("Имена не равны");
        }
















    }
}
