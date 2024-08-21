package org.javaacademy.core.homework.homework4.ex1.Car;

public class LightCar extends Car {

    private boolean hasCruiseControl;

    public LightCar(boolean isClean, double length, double height, double width, boolean hasCruiseControl) {
        super(isClean, length, height, width);
        this.hasCruiseControl = hasCruiseControl;
    }

    public boolean isHasCruiseControl() {
        return hasCruiseControl;
    }
}
