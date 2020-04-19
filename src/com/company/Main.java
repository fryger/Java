package com.company;

public class Main {

    public static void main(String[] args) {

        Car brumek = new Car("Giulia", "Alfa Romeo");
        Animal dog = new Animal("Dog");
        dog.name = "Szarik";
        Human me = new Human();
        me.setFirstName("Adrian");
        me.setLastName("Warda");
        me.setPet(dog);
        me.setCar(brumek);
        me.setPet(new Animal("Lion"));
        me.getPet().name = "Myszojeleń";

        me.setSalary(100.0);
        me.getSalary();

    }
}