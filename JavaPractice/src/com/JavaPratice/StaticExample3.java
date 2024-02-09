package com.JavaPratice;

public class StaticExample3 {

    // static variable
    static int a = 10;
    static int b;

    // static block
    static {
        System.out.println("Static block initialized.");
        b = a * 4;
    }
    /*
      we can perceive that static blocks are automatically called as soon as class is loaded in memory and
      there is nothing to do as we have to in case of calling methods and constructors inside main().
     */

    public static void main(String[] args)
    {
        System.out.println("from main");
        System.out.println("Value of a : "+a);
        System.out.println("Value of b : "+b);
    }
}
