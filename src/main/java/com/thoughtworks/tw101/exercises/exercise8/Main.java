package com.thoughtworks.tw101.exercises.exercise8;

// Exercise #8: Create a new version of Exercise #7 where you also record all of the user’s guesses and print them out
// once they guess correctly. Use an ArrayList to store the guesses. Catch the NumberFormatException and handle the case
// where the user entered a String that is not parseable.

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        final int NUMBER = random.nextInt(100) + 1;
        boolean playing = true;

        Scanner input = new Scanner(System.in);
        System.out.println("Guess the number between 1 and 100: ");
        String n = input.next();
        Guess g = new Guess();

        while (playing) {
            if (g.checkInput(n)) {
                if (g.guessNumCorrectly(NUMBER)) {
                    break;
                }
            }
            n = input.next();
        }
    }
}
