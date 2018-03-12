package com.thoughtworks.tw101.introductory_programming_exercises;

public class DiamondExercises {
    public static void main(String[] args) {
        drawAnIsoscelesTriangle(3);
        drawADiamond(8);
        drawADiamondWithYourName(3);
    }

//    Isosceles Triangle
//    Given a number n, print a centered triangle. Example for n=3:
//              *
//             ***
//            *****
    private static void drawAnIsoscelesTriangle(int n) {
        for (int i = 1; i <= n; i ++) {
            for ( int j = 0; j < n - i; j ++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i *2 ; k ++) {
                System.out.print("*");
            }for ( int j = 0; j < n - i; j ++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

//    Diamond
//    Given a number n, print a centered diamond. Example for n=3:
//              *
//             ***
//            *****
//             ***
//              *

    private static void drawDiamondBottomHalf(int n) {
        for (int i = n-1 ; i >= 1; i --) {
            for ( int j = n - i; j > 0; j --) {
                System.out.print(" ");
            }
            for (int k = 1; k < i *2 ; k ++) {
                System.out.print("*");
            }
            for ( int j = n - i; j > 0; j --) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void drawADiamond(int n) {
        drawAnIsoscelesTriangle(n);
        drawDiamondBottomHalf(n);
    }



//    Diamond with Name
//    Given a number n, print a centered diamond with your name in place of the middle line. Example for n=3:
//
//             *
//            ***
//           Bill
//            ***
//             *
    private static void drawADiamondWithYourName(int n) {
        for (int i = 1; i < n; i ++) {
            for ( int j = 0; j < n - i; j ++) {
                System.out.print(" ");
            }
            for (int k = 1; k < i *2 ; k ++) {
                System.out.print("*");
            }
            for ( int j = 0; j < n - i; j ++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println("Wanchen");
        drawDiamondBottomHalf(n);
    }
}
