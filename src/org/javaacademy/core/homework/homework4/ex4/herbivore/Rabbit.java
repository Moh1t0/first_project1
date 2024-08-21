package org.javaacademy.core.homework.homework4.ex4.herbivore;

import org.javaacademy.core.homework.homework4.ex4.AnimalException;

public class Rabbit extends Herbivore {

    public Rabbit(boolean isAlive, double weight) {
        super(isAlive, weight);
    }

    @Override
    public void run() throws AnimalException {
        if (!isAlive()) {
            throw new AnimalException("Животное не может бегать");
        } else {
            System.out.println("Кролик быстро бежит");
        }
    }

}
