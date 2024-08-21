package org.javaacademy.core.homework.homework5.ex2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Computer {
    private String userName;

    public void userLogIn(String userName) {
        this.userName = userName;
    }

    public void userLogOut() {
        this.userName = "";
    }

    public void sendsMessage(String message) {
        System.out.println(message);
    }
}


