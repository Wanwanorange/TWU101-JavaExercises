package com.thoughtworks.tw101.exercises.exercise8;

import java.util.ArrayList;

public class Guess {
    public Integer guess;
    public ArrayList<Integer> guesses = new ArrayList<>();

    private void setGuess(Integer guess) {
        this.guess = guess;
    }

    public boolean checkInput(String s) {
        try {
            Integer val = Integer.parseInt(s);
            if (val >= 1 && val <= 100) {
                setGuess(val);
                guesses.add(val);
                return true;
            } else {
                System.out.println("Not within the range.");
            }
        } catch(NumberFormatException e) {
            System.out.println(e.toString());
        }
        return false;
    }

    public boolean guessNumCorrectly(final Integer number) {
        int comparison = guess.compareTo(number);
        if (comparison == 0) {
            System.out.println("You guessed it right, you win!");
            printGuesses();
            return true;
        } else {
            if (comparison > 0) {
                System.out.println("You guessed too high.");
            } else if (comparison < 0) {
                System.out.println("You guessed too low.");
            }
            return false;
        }
    }

    private void printGuesses() {
        for (Integer g: guesses) {
            System.out.print(g + " ");
        }
    }
}
