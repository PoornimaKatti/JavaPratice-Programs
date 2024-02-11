package com.JavaPratice;
// this: to pass as an argument in the method.It is mainly used in the event handling
// in a situation where we have to provide reference of a class to another one.
// It is used to reuse one object in many methods.
public class A3 {

        void m(A3 obj){
            System.out.println("method is invoked");
        }
        void p(){
            m(this);
        }
        public static void main(String args[]){
            A3 a1 = new A3();
            a1.p();
        }
    }


