package org.javaacademy.core.homework.homework3.ex2.phone.components;

public class Cpu {

   private int mhz;

    public Cpu(int mhz) {
        this.mhz = mhz;
    }

    public int getMhz() {
        return mhz;
    }

    @Override
    public String toString() {
        return "Cpu{" +
                "mhz=" + mhz +
                '}';
    }
}
