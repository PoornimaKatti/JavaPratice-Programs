package com.JavaPratice;


    interface Calculator {
        int calculate(int a, int b);
    }

    class Addition1 implements Calculator {
        public int calculate(int a, int b) {
            return a + b;
        }
    }

    public class AbstractionExample2 {
        public static void main(String[] args) {
            Calculator add = new Addition1();
            System.out.println("Result: " + add.calculate(5, 3)); // Output: Result: 8
        }
    }


