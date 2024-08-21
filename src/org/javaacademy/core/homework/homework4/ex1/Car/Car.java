package org.javaacademy.core.homework.homework4.ex1.Car;

public abstract class Car {

    private boolean isClean;
    private double length;
    private double height;
    private double width;

    public Car(boolean isClean, double length, double height, double width) {
        this.isClean = false;
        this.width = length;
        this.height = height;
        this.length = width;
    }

    public boolean isClean() {
        return isClean;
    }

    public void setClean(boolean clean) {
        isClean = clean;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
