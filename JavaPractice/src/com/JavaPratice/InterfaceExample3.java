package com.JavaPratice;

/*
default methods allow adding new methods to interfaces without breaking existing implementations.
They provide a default implementation that can be overridden in implementing classes.

Static methods in interfaces are utility methods that are not tied to any specific instance of the interface.
They can be called directly using the interface name.

 */
interface MyInterface {
    // Abstract method
    void abstractMethod();

    // Default method (introduced in Java 8)
    default void defaultMethod() {
        System.out.println("Default method in MyInterface");
    }

    // Static method (introduced in Java 8)
    static void staticMethod() {
        System.out.println("Static method in MyInterface");
    }
}

class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Abstract method implementation in MyClass");
    }
}

public class InterfaceExample3 {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Call abstract method
        obj.abstractMethod();

        // Call default method
        obj.defaultMethod();

        // Call static method
        MyInterface.staticMethod();
    }
}
