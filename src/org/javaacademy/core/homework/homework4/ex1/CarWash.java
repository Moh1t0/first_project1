package org.javaacademy.core.homework.homework4.ex1;

import org.javaacademy.core.homework.homework4.ex1.Car.Car;

public class CarWash {

    static final int RATE_FOR_LARGE_CARS = 4000;
    static final int RATE_FOR_SMALL_CARS = 2000;

    //если длина > 6 или высота > 2.5 метра или ширина > 2, то машина считается крупной
    public int washCar(Car car) {
        car.setClean(true);
        if (car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2) {
            return RATE_FOR_LARGE_CARS;
        }
        return RATE_FOR_SMALL_CARS;
    }

    public int washCars(Car[] cars) {
        int totalPrice = 0;
        for (Car car : cars) {
            if (car.getLength() > 6 || car.getHeight() > 2.5 || car.getWidth() > 2) {
                totalPrice += RATE_FOR_LARGE_CARS;
            } else {
                totalPrice += RATE_FOR_SMALL_CARS;
            }
        }
        System.out.println("Общая сумма за мытье всех машин: " + totalPrice);
        return totalPrice;
    }
}
