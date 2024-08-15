package org.javaacademy.core.homework.homework3.ex2.phone.components;

public class Camera {
    private int megaPixels;

    public Camera(int megaPixels) {
        this.megaPixels = megaPixels;
    }

    public void takePhoto() {
        System.out.println("Сделано фото");
    }
}
