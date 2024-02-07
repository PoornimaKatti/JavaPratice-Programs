package com.JavaPratice;
//Although using interfaces for constants is straightforward,
// it's important to note that interface constants are implicitly public, static, and final.
interface Constants {
    // Constant fields
    int MAX_VALUE = 100;
    String DEFAULT_NAME = "Poornima katti";
}

public class ConstantInterface {
    public static void main(String[] args) {
        // Accessing constants directly from interface name
        System.out.println("Max value: " + Constants.MAX_VALUE);
        System.out.println("Default name: " + Constants.DEFAULT_NAME);
    }
}
