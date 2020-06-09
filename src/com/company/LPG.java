package com.company;

public class LPG extends Car {
    public LPG(String model, String manufacturer, Double value, int year) {
        super(model, manufacturer, value, year);
    }

    @Override
    public void refuel() {
        fuel = fuel + 100;
    }
}
