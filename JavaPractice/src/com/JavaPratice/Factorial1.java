package com.JavaPratice;
import java.util.Scanner;
//FactorialWith

//Recursion refers to the process in which a function calls itself directly or indirectly in order to solve a problem.
public class Factorial1 {


        public static int factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();
            int result = factorial(num);
            System.out.println("Factorial of " + num + " using recursion: " + result);
            scanner.close();
        }
    }


