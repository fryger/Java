package com.company;

public class Main {

    public static void main(String[] args) throws Exception {

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
        Human myWife = new Human();
        me.setFirstName("Madzia");
        me.setLastName("Madzia");

        me.pet.sellMe(myWife, me, 50.0);

    }
}