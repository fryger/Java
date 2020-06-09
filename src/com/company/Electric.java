package com.company;

public class Electric extends Car {
    public Electric(String model, String manufacturer, Double value, int year) {
        super(model, manufacturer, value, year);
    }

    @Override
    public void refuel() {
        fuel = fuel + 100;
    }
}
