package com.thoughtworks.tw101.exercises.exercise1;

// Exercise #1: Print all odd numbers from 1 to 100 and their sum.

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        int counter = 0;

        while (counter <100){
            if (counter % 2 != 0) {
                System.out.print(counter + " ");
                sum += counter;
            }
            counter++;
        }
        System.out.println("\n" + sum);
    }
}
