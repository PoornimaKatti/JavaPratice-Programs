package com.JavaPratice;

public class StaticMethodExample {
    // Static method to calculate the square of a number
    public static int square(int num) {
        return num * num;
    }

    public static void main(String[] args) {
        int result = square(5); // Calling static method without creating an object
        System.out.println("Square of 5 is: " + result);

    }
}
