package org.javaacademy.core.homework.homework4.ex3.human;

import org.javaacademy.core.homework.homework4.ex3.Sound;

public class Builder extends Human implements Sound {

    public void sound(){
        System.out.println("Я строитель");
        super.sound();
    }
}
