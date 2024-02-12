package com.JavaPratice;
/*
this: to refer current class instance variable
The this keyword can be used to refer current class instance variable.
 If there is ambiguity between the instance variables and parameters,
 this keyword resolves the problem of ambiguity.
 */
public class Student4 {

        int rollno;
        String name;
        float fee;
    Student4(int rollno,String name,float fee){
            rollno=rollno;
            name=name;
            fee=fee;
        }
        void display(){
        System.out.println(rollno+" "+name+" "+fee);}
    }
    class TestThis1{
        public static void main(String args[]){
            Student4 s1=new Student4(111,"ankit",5000f);
            Student4 s2=new Student4(112,"sumit",6000f);
            s1.display();
            s2.display();
        }}

