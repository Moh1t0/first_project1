package org.javaacademy.core.homework.homework4.ex4.predator;

import org.javaacademy.core.homework.homework4.ex4.Alive;
import org.javaacademy.core.homework.homework4.ex4.AnimalException;

/**
 * Хищник
 */
public class Predator extends Alive {
    Alive alive;
    Predator predator;

    public Predator(boolean isAlive, double weight) {
        super(isAlive, weight);
    }
    //Хищник
    //Умеет нападать на живое. В случае если вес жертвы больше хищника, то хищник погибает,
    //иначе вес хищника увеличивается на треть веса жертвы и жертва погибает.
    //Может нападать только при живом состоянии, иначе выпадает ошибка "Животное не может нападать".

    public void attack(Alive alive) throws AnimalException {
        if (!isAlive()) {
            throw new AnimalException("Животное не может нападать");
        } else {
            if (alive.getWeight() > this.getWeight()) {
                this.die();
            } else {
                this.setWeight(this.getWeight() + (alive.getWeight() / 3));
            }
        }
    }

//    public void attack(Alive alive) throws AnimalException {
//        if (!isAlive()) {
//            throw new AnimalException("Животное не может нападать");
//        }
//        if (alive.getWeight() > this.getWeight()) {
//            this.die();
//        } else {
//            this.setWeight(this.getWeight() + alive.getWeight() / 3);
//        }
//    }
}

