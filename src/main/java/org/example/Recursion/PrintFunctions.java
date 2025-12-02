package org.example.Recursion;

public class PrintFunctions {
    public static void main(String[] args) {
        printDecreasing(10);
        printIncreasing(10);
    }

    private static void printIncreasing(int n) {

        // n = 10
        // print - 1 2 3 4 5 6 7 8 9 10

        // f(10) =  1 2 3 4 5 6 7 8 9 10
        // f(11) = f(10) 11

        // f(n) = f(n-1) n
        // n = 0 return

        if(n<1) return;
        printIncreasing(n-1);
        System.out.println(n + "");
    }

    private static void printDecreasing(int n) {

        // n = 10
        // print - 10 9 8 7 6 5 4 3 2 1

        // f(10) = 10 9 8 7 6 5 4 3 2 1
        // f(11) = 11 10 9 8 7 6 5 4 3 2 1  = 11 f(10)

        // f(n) = n f(n-1)
        // n = 0 return

        if(n < 0) return;
        System.out.println(n + " ");
        printDecreasing(n-1);
    }


}
