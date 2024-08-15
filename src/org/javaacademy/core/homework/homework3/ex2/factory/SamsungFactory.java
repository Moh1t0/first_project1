package org.javaacademy.core.homework.homework3.ex2.factory;

import org.javaacademy.core.homework.homework3.ex2.phone.Samsung;
import org.javaacademy.core.homework.homework3.ex2.phone.components.Camera;
import org.javaacademy.core.homework.homework3.ex2.phone.components.Cpu;
import org.javaacademy.core.homework.homework3.ex2.phone.components.Frame;

public class SamsungFactory {
    public static void main(String[] args) {
        Camera camera = new Camera(16);
        Cpu cpu = new Cpu(1500);
        Frame frame = new Frame(60, 200, 15);
        Samsung samsung = new Samsung(camera, cpu, frame);
        samsung.takePhoto();
    }
}
