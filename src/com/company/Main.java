package com.company;

public class Main {

    public static void main(String[] args) {
        Animal dog = new Animal("dog");

        dog.name = "Wojtek";

        dog.feed();
        dog.feed();
        dog.feed();
        Human me = new Human();
        me.firstName = "asd";
        me.lastName = "asd";

        me.pet.feed();


    }
}
