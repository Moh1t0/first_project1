package org.javaacademy.core.homework.homework4.ex1.Car;

public class Bus extends Car {
    private int maxCountPassanger;

    public int getMaxCountPassanger() {
        return maxCountPassanger;
    }

    public Bus(boolean isClean, double length, double height, double width, int maxCountPassanger) {
        super(isClean, length, height, width);
        this.maxCountPassanger = maxCountPassanger;
    }
}

