package com.company;

public class Car {

    final String model;
    final String manufacturer;
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
}