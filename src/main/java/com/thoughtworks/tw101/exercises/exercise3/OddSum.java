package com.thoughtworks.tw101.exercises.exercise3;

public class OddSum {

    public int of(int start, int end) {
        int sum = 0, pointer = start;

        while (pointer < end) {
            if (pointer % 2 != 0) {
                sum += pointer;
            }
            pointer++;
        }
        return sum;
    }
}
