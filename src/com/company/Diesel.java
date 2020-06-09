package com.company;

public class Diesel extends Car {
    public Diesel(String model, String manufacturer, Double value, int year) {
        super(model, manufacturer, value, year);
    }

    @Override
    public void refuel() {
        fuel = fuel + 100;
    }
}
