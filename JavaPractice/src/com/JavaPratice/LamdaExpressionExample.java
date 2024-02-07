package com.JavaPratice;

/*
A lambda expression is an anonymous function that allows you to pass behavior in a more compact and readable way.
syntax:
(parameters) -> expression

 */
public class LamdaExpressionExample {
    public static void main(String[] args) {
        // Old way
        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from old way!");
            }
        };

        // Using lambda expression
        Runnable runnable2 = () -> System.out.println("Hello from lambda expression!");

        // Run the runnables
        runnable1.run();
        runnable2.run();
    }
}
