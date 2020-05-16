package com.company;

public class LPG extends Car {
    public LPG(String model, String manufacturer, Double value) {
        super(model, manufacturer, value);
    }

    @Override
    public void refuel() {
        fuel = fuel + 100;
    }
}
