package com.thoughtworks.tw101.introductory_programming_exercises;

//  Prime Factors Exercise
//  Write a method generate(int n) that given an integer N will return a list of integers such that the numbers
//  are the factors of N and are arranged in increasing numerical order.
//
//  For example, generate(1) should return an empty list and generate(30) should return the numbers: 2,3,5.

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {
    public static void main(String[] args) {
        List<Integer> primeFactors = generate(30);
        System.out.println(primeFactors);
    }

    private static List<Integer> generate(int n) {
        List<Integer> primeNums = primeCandidates(n);
        List<Integer> primeFactors = new ArrayList<>();
        for (Integer prime: primeNums) {
            if (n % prime == 0) {
                primeFactors.add(prime);
            }
        }
        return primeFactors;
    }

    private static List<Integer> primeCandidates(int n) {
        List<Integer> primeNums = new ArrayList<>();
        for (int i = 2; i <= n; i ++) {
            boolean prime = true;
            for (int j = 2; j < i; j ++) {
                if (i % j == 0) {
                    prime = false;
                }
            }
            if (prime) {
                primeNums.add(i);
            }
        }

        return primeNums;
    }
}
