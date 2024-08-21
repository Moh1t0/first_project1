package org.javaacademy.core.homework.homework4.ex4.herbivore;

import org.javaacademy.core.homework.homework4.ex4.AnimalException;

public class Elephant extends Herbivore {
    public Elephant(boolean isAlive, double weight) {
        super(isAlive, weight);
    }

    //Травоядное - умеет бегать (не определено как).
    // Но все травоядные могут бегать только в состоянии живое.
    //Иначе выдает ошибку - "Животное не может бегать".

    @Override
    public void run() throws AnimalException {
        if (!isAlive()) {
            throw new AnimalException("Животное не может бегать");
        } else {
            System.out.println("Слон медленно бежит");
        }
    }

}
