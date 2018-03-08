package com.thoughtworks.tw101.exercises.exercise6;

public class Orc implements Monster {
    private String name = "Orc";
    private int hp = 20;

    @Override
    public void takeDamage(int amount) {
        hp -= amount;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + ", " + hp + " hitpoints");
    }
}
