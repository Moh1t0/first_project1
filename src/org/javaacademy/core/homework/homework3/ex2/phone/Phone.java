package org.javaacademy.core.homework.homework3.ex2.phone;

import org.javaacademy.core.homework.homework3.ex2.phone.components.Camera;
import org.javaacademy.core.homework.homework3.ex2.phone.components.Cpu;
import org.javaacademy.core.homework.homework3.ex2.phone.components.Frame;

public abstract class Phone {
    private Camera camera;
    private Cpu cpu;
    private Frame frame;

    public Phone(Camera camera, Cpu cpu, Frame frame) {
        this.camera = camera;
        this.cpu = cpu;
        this.frame = frame;
    }

    public void takePhoto(){
        camera.takePhoto();
    }

    public Camera getCamera() {
        return camera;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public Frame getFrame() {
        return frame;
    }
}

