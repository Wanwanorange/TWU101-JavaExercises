package com.thoughtworks.tw101.exercises.exercise7;

public class Guess {
    public Integer guess;

    private void setGuess(Integer guess) {
        this.guess = guess;
    }

    public boolean checkInput(String s) {
        try {
            Integer val = Integer.parseInt(s);
            if (val >= 1 && val <= 100) {
                setGuess(val);
                return true;
            } else {
                System.out.println("Not within the range.");
            }
        } catch(Exception e) {
            System.out.println("Not a valid number.");
        }
        return false;
    }

    public boolean guessNumCorrectly(final Integer number) {
        int comparison = guess.compareTo(number);
        if (comparison == 0) {
            System.out.println("You guessed it right, you win!");
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
}
