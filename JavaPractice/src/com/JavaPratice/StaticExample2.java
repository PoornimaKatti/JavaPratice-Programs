package com.JavaPratice;
//When a member is declared static,
// it can be accessed before any objects of its class are created, and without reference to any object.
public class StaticExample2 {
    // static method
    static void m1()
    {
        System.out.println("from m1");
    }

    public static void main(String[] args)
    {
        // calling m1 without creating
        // any object of StaticExample2
        m1();
    }
}
