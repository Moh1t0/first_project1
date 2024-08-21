package org.javaacademy.core.homework.homework4.ex4.herbivore;

import org.javaacademy.core.homework.homework4.ex4.Alive;
import org.javaacademy.core.homework.homework4.ex4.AnimalException;

/**
 * Травоядное
 */
public abstract class Herbivore extends Alive {

    public Herbivore(boolean isAlive, double weight) {
        super(isAlive, weight);
    }

    public abstract void run() throws AnimalException;

}
