package com.thoughtworks.tw101.exercises.exercise6;

public class Troll implements Monster {
    private String name = "Troll";
    private int hp = 40;

    @Override
    public void takeDamage(int amount) {
        hp -= amount/2;
    }

    @Override
    public void reportStatus() {
        System.out.println(name + ", " + hp + " hitpoints");
    }
}
