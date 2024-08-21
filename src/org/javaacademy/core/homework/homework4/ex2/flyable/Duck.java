package org.javaacademy.core.homework.homework4.ex2.flyable;

import org.javaacademy.core.homework.homework4.ex2.FlyException;

public class Duck implements Flyable {

    private boolean isInjured;

    public Duck(boolean isInjured) {
        this.isInjured = isInjured;
    }

    public boolean isInjured() {
        return isInjured;
    }

    public void fly() throws FlyException {
        if (isInjured) {
            throw new FlyException("Ошибка: Утка подстрелена, лететь не может");
        }
        System.out.println("Утка летит");
    }
}
