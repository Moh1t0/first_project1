package org.javaacademy.core.homework.homework4.ex1;

import org.javaacademy.core.homework.homework4.ex1.Car.Bus;
import org.javaacademy.core.homework.homework4.ex1.Car.Car;
import org.javaacademy.core.homework.homework4.ex1.Car.LightCar;

public class Runner {
    public static void main(String[] args) {
        //В автомойку были отправлены грязные машины мэрии: 4 легковых(длина высота ширина) (5х2х1.8),
        //5 автобусов(12х3х2.3)
        //Посчитать и вывести: сколько мэрия заплатит денег за мойку всех машин.
        LightCar lightCar = new LightCar(false, 5, 2, 1.8, true);
        LightCar lightCar1 = new LightCar(false, 5, 2, 1.8, false);
        LightCar lightCar2 = new LightCar(false, 5, 2, 1.8, true);
        LightCar lightCar3 = new LightCar(false, 5, 2, 1.8, false);

        Bus bus = new Bus(false, 12, 3, 2.3, 20);
        Bus bus1 = new Bus(false, 12, 3, 2.3, 20);
        Bus bus2 = new Bus(false, 12, 3, 2.3, 20);
        Bus bus3 = new Bus(false, 12, 3, 2.3, 20);
        Bus bus4 = new Bus(false, 12, 3, 2.3, 20);

        CarWash carWash = new CarWash();

        Car[] cars = {lightCar, lightCar1, lightCar2, lightCar3, bus, bus1, bus2, bus3, bus4};
        carWash.washCars(cars);


    }
}
