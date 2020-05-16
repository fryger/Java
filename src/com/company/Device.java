package com.company;

public abstract class Device implements Saleable {
    String manufacturer;
    String model;

    public abstract void sellMe();
}
