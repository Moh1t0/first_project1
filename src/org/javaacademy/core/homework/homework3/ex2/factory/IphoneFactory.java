package org.javaacademy.core.homework.homework3.ex2.factory;

import org.javaacademy.core.homework.homework3.ex2.phone.Iphone;
import org.javaacademy.core.homework.homework3.ex2.phone.components.Camera;
import org.javaacademy.core.homework.homework3.ex2.phone.components.Cpu;
import org.javaacademy.core.homework.homework3.ex2.phone.components.Frame;

public class IphoneFactory {
    public static void main(String[] args) {
        Camera camera = new Camera(8);
        Frame frame = new Frame(60, 200, 15);
        Cpu cpu = new Cpu(1000);
        Cpu cpu1 = new Cpu(1100);
        Iphone iphone = new Iphone(camera, cpu, cpu1, frame);
        iphone.cpusInfo();
        iphone.takePhoto();
    }
}
