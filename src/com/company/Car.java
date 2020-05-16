package com.company;

public abstract class Car extends Device {

    public int fuel = 50;
    private Double mileage;
    String color;
    private Double value;

    public Car(String model, String manufacturer, Double value) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.value = value;
    }

    public Double getMileage() {
        return mileage;
    }

    public void setMileage(Double mileage) {
        this.mileage = mileage;
    }

    public Double getvalue() {
        return this.value;
    }

    @Override
    public void turnOn() {
        System.out.println("Yeeah, I'm turned on");
    }

    public abstract void refuel();
}