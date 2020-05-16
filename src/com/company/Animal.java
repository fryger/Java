package com.company;

import java.io.File;

public class Animal implements Saleable {
    final String species;
    String name;
    File pic;
    private Double weight;

    static final Double DEFAULT_DOG_WEIGHT = 10.0;
    static final Double DEFAULT_LION_WEIGHT = 180.0;
    static final Double DEFAULT_OTHER_WEIGHT = 1.0;

    public Animal(String species) {
        this.species = species;
        if (species.equals("Dog")) {
            weight = DEFAULT_DOG_WEIGHT;
        } else if (species.equals("Lion")) {
            weight = DEFAULT_LION_WEIGHT;
        } else {
            weight = DEFAULT_OTHER_WEIGHT;
        }

    }

    void feed() {
        if (weight <= 0.0) {
            System.out.println("I'm dead *RIP*");

        } else {
            weight += 0.1;
            System.out.println("Thx bro, my weight is now " + weight);
        }
    }

    void takeForAWalk() {
        if (weight <= 0.0) {
            System.out.println("I'm dead *RIP*");
        } else {
            weight -= 1;
            System.out.println("Sir, my weight is now " + weight);
        }
    }

    public Double getWeight() {

        return weight;
    }

    @Override
    public void sellMe(Human buyer, Human seller, Double price) throws Exception {
        if (this.getClass().getName() == "com.company.Human") {
            throw new Exception("NO SLAVERY!!!");
        }
        if (buyer.cash < price) {
            throw new Exception("not enough money, sorry");
        }
        if (seller.getPet() != this) {
            throw new Exception("you cannot sell something that is not yours");
        }
        buyer.cash -= price;
        seller.cash += price;
        buyer.setPet(this);
        seller.setPet(null);
        System.out.println(buyer.getFirstName() + " already bought " + this + " from " + seller.getFirstName());
    }
}