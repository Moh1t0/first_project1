package org.javaacademy.core.lesson7.aiport_ex2;

public interface Flyable {
    int count = 10; // public static final

    void fly();

    /**
     * Приземление
     */
    default void land() {
        System.out.println("Летящий объект приземлился");
    }
}
