package com.company;

public class Diesel extends Car {
    public Diesel(String model, String manufacturer, Double value) {
        super(model, manufacturer, value);
    }

    @Override
    public void refuel() {
        fuel = fuel + 100;
    }
}
