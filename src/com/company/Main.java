package com.company;

import com.company.creatures.Animal;


public class Main {

    public static void main(String[] args) throws Exception {

        Car brumek = new Car("Giulia", "Alfa Romeo", 1000.0, 1994) {
            @Override
            public void refuel() {

            }
        };
        Car transitek = new Car("Transit", "Ford", 1500.0, 2016) {
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
        me.setCar(brumek, 1);
        me.setCar(transitek, 0);
        me.setPet(new Animal("Lion"));
        me.getPet().name = "Myszojeleń";
        Human myWife = new Human();
        myWife.setFirstName("Madzia");
        myWife.setLastName("Fryger");
        myWife.setSalary(100000.0);
        Phone erikson = new Phone();
        me.setPhone(erikson);
        System.out.println(me.toString());
        me.getCar(1).turnOn();

        try {
            me.getPet().sellMe(myWife, me, 10.0);
        } catch (Exception e) {
            e.printStackTrace();
        }

        myWife.getPet().food(50);
        me.getPhone().installAnnApp("mBank");
        me.getCar(1).refuel();

        System.out.println(me.wealth());
        me.showoff();
        me.sorting();
        me.showoff();
        System.out.println(brumek.owners);
        me.getCar(0).sellMe(myWife, me, 10.0);
        System.out.println(brumek.owners);
        System.out.println(brumek.transactions());
    }
}