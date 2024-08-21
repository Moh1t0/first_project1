package org.javaacademy.core.homework.homework3.ex2.phone;

import org.javaacademy.core.homework.homework3.ex2.phone.components.Camera;
import org.javaacademy.core.homework.homework3.ex2.phone.components.Cpu;
import org.javaacademy.core.homework.homework3.ex2.phone.components.Frame;

import java.util.Arrays;

public class Iphone extends Phone {

    Cpu cpu1;

    public Iphone(Camera camera, Cpu cpu, Cpu cpu1, Frame frame) {
        super(camera, cpu, frame);
        this.cpu1 = cpu1;
    }

    public Cpu getCpu1() {
        return cpu1;
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "cpu1=" + cpu1 +
                '}';
    }

    public void cpusInfo() {
        System.out.println("Информация о процессорах: ");
        System.out.println("Первый процессор: " + getCpu1());
        System.out.println("Второй процессор: " + getCpu());
    }
}



