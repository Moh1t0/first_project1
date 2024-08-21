package org.javaacademy.core.homework.homework4.ex3.human;

import org.javaacademy.core.homework.homework4.ex3.Sound;

public class Driver extends Human implements Sound {

    public void sound(){
        System.out.println("Я водитель");
    }
}
