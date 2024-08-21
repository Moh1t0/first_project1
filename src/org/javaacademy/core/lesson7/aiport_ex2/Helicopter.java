package org.javaacademy.core.lesson7.aiport_ex2;

public abstract class Helicopter implements Flyable {

    /**
     * Взлет вертикальный
     */
    public void flyVertical() {
        System.out.println("Вертолет взлетает вертикально");
    }
}