package com.company;

import com.company.creatures.Animal;

public class Main {

    public static void main(String[] args) {

        Car brumek = new Car("Giulia", "Alfa Romeo", 1000.0);
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

        System.out.println(me.toString());
        me.getCar().turnOn();

        try {
            me.getPet().sellMe(myWife, me, 10.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        myWife.getPet().food(50);
    }
}