package org.example;

import java.util.Scanner;

/**
 * This class includes two methods: one for generating Fibonacci number at an nth term, and one for displaying it.
 * @author: Quang Hoai Son Vu
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * This main method will get a user's input,
         * check if the input is valid,
         * then call the function to generate the Fibonacci number
         * at the term that is inputted.
         */
        System.out.println("Enter the number of terms: ");
        int n = scanner.nextInt();
        if (n <= 0){
            System.out.println("Please enter a positive number.");
        }
        else {
            int term = fibo(n);
            System.out.println("The " + n + "th term of the Fibonacci sequence is " + term);
        }
    }

    /**
     * This fibo function is used to find fibonacci number using recursion
     * @return n
      */
    private static int fibo(int n){
        if (n < 2){
            return n;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
