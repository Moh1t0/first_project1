package org.javaacademy.core.homework.homework4.ex2.flyable;

import org.javaacademy.core.homework.homework4.ex2.FlyException;

public class Airplane implements Flyable {

    private int countPassengers;

    public Airplane(int countPassengers) {
        this.countPassengers = countPassengers;
    }

    public int getCountPassengers() {
        return countPassengers;
    }


    public void fly() throws FlyException {
        if (countPassengers < 0) {
            throw new FlyException("Ошибка: Пассажиров меньше нуля");
        }
        System.out.println("Самолет летит");
    }
}
