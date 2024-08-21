package org.javaacademy.core.homework.homework4.ex2;

import org.javaacademy.core.homework.homework4.ex2.flyable.Airplane;
import org.javaacademy.core.homework.homework4.ex2.flyable.Duck;

public class Runner {
    public static void main(String[] args) {
        Duck duck = new Duck(true);
        Duck duck1 = new Duck(false);
        Airplane airplane = new Airplane(10);
        Airplane airplane1 = new Airplane(-1);

        try {
            duck1.fly();
            duck.fly();
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }

        try {
            airplane.fly();
            airplane1.fly();
            System.out.println("Пассажиры есть, взлетаем");
        } catch (FlyException e) {
            System.out.println(e.getMessage());
        }

    }
}
