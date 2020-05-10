package com.company;

public class Main {

    public static void main(String[] args) {

        Car brumek = new Car("Giulia", "Alfa Romeo", 1000.0);
        Animal dog = new Animal("Dog");
        dog.name = "Szarik";
        Human me = new Human();
        me.setFirstName("Adrian");
        me.setLastName("Warda");
        me.setSalary(10.0);
        me.setPet(dog);
        me.setCar(brumek);
        me.setPet(new Animal("Lion"));
        me.getPet().name = "Myszojeleń";

        me.sellMe();
    }
}