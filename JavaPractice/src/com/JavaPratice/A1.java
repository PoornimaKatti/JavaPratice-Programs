package com.JavaPratice;
/*
The this() constructor call can be used to invoke the current class constructor. It is used to reuse the constructor.
Calling default constructor from parameterized constructor:
 */
public class A1 {
    A1(){
        System.out.println("hello a");
    }
    A1(int x){
        this();
        System.out.println(x);
    }
}
class TestThis5{
    public static void main(String args[]){
        A1 a=new A1(10);
    }

}
