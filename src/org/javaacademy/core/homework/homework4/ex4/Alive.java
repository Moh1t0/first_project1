package org.javaacademy.core.homework.homework4.ex4;

public abstract class Alive {
    private boolean isAlive;
    private double weight;

    public void die() {
        isAlive = false;
    }

    public Alive(boolean isAlive, double weight) {
        this.isAlive = isAlive;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
