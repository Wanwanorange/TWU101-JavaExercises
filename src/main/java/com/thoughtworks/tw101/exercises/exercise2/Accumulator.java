package com.thoughtworks.tw101.exercises.exercise2;

public class Accumulator {
    int counter = 0;

    void increment() {
        counter++;
    }

    void total() {
        System.out.println(counter);
    }
}
