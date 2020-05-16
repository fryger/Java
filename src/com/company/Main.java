package com.company;

import com.company.creatures.Animal;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        Car brumek = new Car("Giulia", "Alfa Romeo", 1000.0) {
            @Override
            public void refuel() {

            }
        };
        Animal dog = new Animal("Dog");
        dog.name = "Szarik";
        Human me = new Human();
        me.setFirstName("Adrian");
        me.setLastName("Warda");
        me.setSalary(100000.0);
        me.setPet(dog);
        me.setCar(brumek);
        me.setPet(new Animal("Lion"));
        me.getPet().name = "Myszojeleń";
        Human myWife = new Human();
        myWife.setFirstName("Madzia");
        myWife.setLastName("Fryger");
        myWife.setSalary(100000.0);
        Phone erikson = new Phone();
        me.setPhone(erikson);
        System.out.println(me.toString());
        me.getCar().turnOn();

        try {
            me.getPet().sellMe(myWife, me, 10.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        myWife.getPet().food(50);
        me.getPhone().installAnnApp("mBank");
        me.getCar().refuel();
    }
}