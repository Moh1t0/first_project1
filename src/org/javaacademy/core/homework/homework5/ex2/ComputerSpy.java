package org.javaacademy.core.homework.homework5.ex2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;

public class ComputerSpy extends Computer {
    //Создать компьютерного шпиона, который наследуется от компьютера,
    // при этом хранит в себе обычный компьютер
    //Сделать так, чтобы при вызове методов компьютерного шпиона:
    //1. При входе пользователя делалась запись в comp.log "Пользователь {имя пользователя} вошел"
    // и вызывался метод компьютера.
    //2. При выходе делалась запись в comp.log "Пользователь вышел"
    //3. При отправке сообщения, делалась запись в comp.log:
    // "Пользователь {имя пользователя} отправил сообщение {текст сообщения}"
    // и вызвался метод компьютера.

    protected Computer computer;

    public ComputerSpy(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void userLogIn(String userName) {
        logAction("Пользователь " + userName + " вошел");
        super.userLogIn(userName);
    }

    @Override
    public void userLogOut() {
        logAction("Пользователь вышел");
        super.userLogOut();
    }

    @Override
    public void sendsMessage(String message) {
        logAction("Пользователь " + "отправил сообщение: " + message);
        super.sendsMessage(message);
    }

    private void logAction(String action) {
        try {
            try (InputStream inputStream = Runner.class.getClassLoader().getResourceAsStream("comp.log")) {
            }
        } catch (Exception e) {
        }
        try {
            FileWriter fileWriter = new FileWriter("comp.log", true);
            fileWriter.write(action + "\n");
            fileWriter.close();
        } catch (Exception e) {
        }

    }
}
