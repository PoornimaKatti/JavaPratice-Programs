package com.JavaPratice;
//parameters (formal arguments) and instance variables are same.
// So, we are using this keyword to distinguish local variable and instance variable.
public class Student5 {

    int rollno;
    String name;
    float fee;
    Student5(int rollno,String name,float fee){
        this.rollno=rollno;
        this.name=name;
        this.fee=fee;
    }
    void display(){
        System.out.println(rollno+" "+name+" "+fee);}
}

class TestThis2 {
    public static void main(String args[]) {
        Student5 s1 = new Student5(111, "ankit", 5000f);
        Student5 s2 = new Student5(112, "sumit", 6000f);
        s1.display();
        s2.display();
    }
}
