package com.thoughtworks.tw101.exercises.exercise7;

import java.util.Random;
import java.util.Scanner;

// Write a program that chooses a random number between 1 and 100. Then asks the user to enter a guess. If they guess
// right then tell them they win, otherwise tell them if they guessed too high or low. Keep asking the user to guess
// until they get the right answer. Use classes to separate the different concerns of this program.
// Integer.parseInt is a good way to convert user input into an Integer.

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
