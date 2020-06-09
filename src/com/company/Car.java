package com.company;

import java.util.Arrays;


public abstract class Car extends Device implements Comparable<Car>, Saleable {

    public int fuel = 50;
    private Double mileage;
    String color;

    public Car(String model, String manufacturer, Double value, int year) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.value = value;
        this.yearOfProduction = year;
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

    public static <T> int find(T[] a, T target) {
        return Arrays.asList(a).indexOf(target);
    }

    @Override
    public void turnOn() {
        System.out.println("Yeeah, I'm turned on");
    }

    public abstract void refuel();

    public int getYear() {
        return this.yearOfProduction;
    }

    public int compareTo(Car compareCar) {

        int compareQuantity = compareCar.getYear();

        //ascending order
        return this.yearOfProduction - compareQuantity;

        //descending order
        //return compareQuantity - this.quantity;

    }

    @Override
    public void sellMe(Human buyer, Human seller, Double price) throws Exception {

        if (Arrays.asList(seller.garage).contains(this)) {
            for (int i = 0; i < seller.garage.length; i++) {
                if (buyer.garage[i] == null) {
                } else {
                    throw new Exception("No space for a new car");
                }
            }
            if (buyer.cash >= price) {
                seller.garage[find(seller.garage, this)] = null;
                for (int j = 0; j < buyer.garage.length; j++) {
                    if (buyer.garage[j] == null) {
                        buyer.garage[j] = this;
                        buyer.cash -= price;
                        seller.cash += price;
                        System.out.println("Car is sold");
                        break;
                    }
                }
            } else {
                throw new Exception("No money");
            }
        } else {
            throw new Exception("Car is not present in seller garage");
        }
    }
}