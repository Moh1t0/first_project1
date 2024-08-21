package org.javaacademy.core.homework.homework4.ex4.predator;

import org.javaacademy.core.homework.homework4.ex4.Alive;
import org.javaacademy.core.homework.homework4.ex4.AnimalException;

public class Tiger extends Predator {

    public Tiger(boolean isAlive, double weight) {
        super(isAlive, weight);
    }

    public void attack(Alive alive, Predator predator, Tiger tiger) throws AnimalException {
        super.attack(alive);
        if (alive.getWeight() < (tiger.getWeight() * 2)) {
            tiger.setWeight(tiger.getWeight() + alive.getWeight() / 3);
        } else {
            tiger.die();
        }
    }
}
