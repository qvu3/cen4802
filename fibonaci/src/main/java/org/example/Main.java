package org.example;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
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

   
    private static int fibo(int n){
        if (n < 2){
            return n;
        }
        else {
            return fibo(n-1) + fibo(n-2);
        }
    }
}
