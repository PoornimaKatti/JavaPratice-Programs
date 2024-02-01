package com.JavaPratice;

public class Exception2 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception!");
        } finally {
            System.out.print("Finally block");
        }
    }
}
