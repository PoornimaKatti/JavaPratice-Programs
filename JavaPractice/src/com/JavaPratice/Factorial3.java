package com.JavaPratice;
import java.util.Scanner;
//FactorialWithIteration
public class Factorial3 {

        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            int factorial = 1;
            for (int i = 2; i <= num; i++) {
                factorial *= i;
            }

            System.out.println("Factorial of " + num + " using iterative approach: " + factorial);
            scanner.close();
        }
    }


