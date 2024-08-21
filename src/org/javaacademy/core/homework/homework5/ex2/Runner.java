package org.javaacademy.core.homework.homework5.ex2;

import java.io.IOException;
import java.io.InputStream;

public class Runner {
    public static void main(String[] args) {
        //Создать Runner
        //1. В нем создать компьютер.
        //2. Создать шпиона с компьютером из пункта 1
        //3. Сделать вход пользователя, отправку сообщения, выход пользователя через компьютерного шпиона.
        //4. Проверить наличие логов в comp.log
        // (файл должен быть внутри репозитория и отправлен в удаленное репо)
        Computer computer = new Computer();
        ComputerSpy computerSpy = new ComputerSpy(computer);
        computerSpy.userLogIn("Иван");
        computerSpy.sendsMessage("Юрий, добрый день");
        computerSpy.userLogOut();
    }
}
