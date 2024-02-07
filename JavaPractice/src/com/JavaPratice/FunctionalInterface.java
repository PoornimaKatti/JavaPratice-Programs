package com.JavaPratice;
/*
A functional interface is an interface that contains only one abstract method.
 It can have any number of default methods, static methods, or Object class methods (methods inherited from Object class),
  but it must contain exactly one abstract method.
  . Functional interfaces are extensively used in lambda expressions.
 */
interface MyFunctionalInterface {
    void myMethod(int num);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        // Using lambda expression to implement the abstract method of functional interface
        MyFunctionalInterface obj = (num) -> System.out.println("Number: " + num);

        // Calling the method using the lambda expression
        obj.myMethod(10);
    }
}
