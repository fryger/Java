package com.company;

public class Electric extends Car {
    public Electric(String model, String manufacturer, Double value) {
        super(model, manufacturer, value);
    }

    @Override
    public void refuel() {
        fuel = fuel + 100;
    }
}
