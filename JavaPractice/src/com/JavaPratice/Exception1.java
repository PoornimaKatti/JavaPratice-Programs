package com.JavaPractice;

public class Exception1 {
    // Assuming count is declared and initialized somewhere
    int count = 0;

    void A() throws Exception {
        try {
            count++;
        } catch (Exception e) {
            count++;
        }

        try {
            count++;
        } catch (Exception e) {
            count++;
        }

        try {
            count++;
            throw new Exception();
        } catch (Exception e) {
            count++;
            throw new Exception();
        } finally {
            count++; // This block will always be executed, regardless of whether an exception is thrown or not.
        }
    }

    public static void main(String[] args) {
        Exception1 obj = new Exception1();
        try {
            obj.A();
        } catch (Exception e) {
            // Handle the exception if needed
        }

        System.out.println("Count value: " + obj.count);
    }
}
