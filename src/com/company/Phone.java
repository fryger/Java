package com.company;

public class Phone extends Device {
    Double screenSize;

    @Override
    public void turnOn() {
        System.out.println("Yeeah, I'm turned on");
    }
}
