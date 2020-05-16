package com.company.creatures;

public class FarmAnimal extends Animal implements Edible {
    public boolean life = true;

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {
        System.out.println("I'm dead *RIP*");
        life = false;
    }
}
