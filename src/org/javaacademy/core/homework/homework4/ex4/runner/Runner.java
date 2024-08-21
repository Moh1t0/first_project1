package org.javaacademy.core.homework.homework4.ex4.runner;

import org.javaacademy.core.homework.homework4.ex4.AnimalException;
import org.javaacademy.core.homework.homework4.ex4.herbivore.Elephant;
import org.javaacademy.core.homework.homework4.ex4.herbivore.Rabbit;
import org.javaacademy.core.homework.homework4.ex4.predator.Predator;
import org.javaacademy.core.homework.homework4.ex4.predator.Tiger;
import org.javaacademy.core.homework.homework4.ex4.predator.Wolf;

public class Runner {
    public static void main(String[] args) throws AnimalException {
        //1.Создать Тигра(300 кг), Волка(50 кг), кролика(2 кг), Слона (2000 кг)
        //2.Кролик должен пробежать
        //3.Волк ест кролика
        //4.Тигр ест волка
        //5.Тигр пытается съесть слона
        //6.Слон пробегает
        //7.Вызвать у съеденного кролика бег, сделать так, чтобы программа НЕ закончилась с ошибкой,
        //а распечатала текст ошибки.
        Tiger tiger = new Tiger(true, 300);
        Wolf wolf = new Wolf(true, 50);
        Rabbit rabbit = new Rabbit(true, 2);
        Elephant elephant = new Elephant(true, 2000);

        try {
            rabbit.run();
            rabbit.die();
            rabbit.run();
        } catch (AnimalException e) {
            System.out.println(e.getMessage());
        }
        wolf.attack(rabbit);
    }
}
