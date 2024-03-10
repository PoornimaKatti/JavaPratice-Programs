package com.JavaPratice;
import java.util.Scanner;
//FactorialWithLoopAndRecursion
public class Factorial2 {


        public static int factorialWithLoop(int n) {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

        public static int factorialWithRecursion(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorialWithRecursion(n - 1);
            }
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = scanner.nextInt();

            int resultLoop = factorialWithLoop(num);
            int resultRecursion = factorialWithRecursion(num);

            System.out.println("Factorial of " + num + " using loop: " + resultLoop);
            System.out.println("Factorial of " + num + " using recursion: " + resultRecursion);
            scanner.close();
        }
    }


