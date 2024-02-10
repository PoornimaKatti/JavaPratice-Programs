package com.JavaPratice;
//Let us see another example of default constructor
//which displays the default values
public class StudentDefaultConstructor {


        int id;
        String name;
        //method to display the value of id and name
        void display(){System.out.println(id+" "+name);}

        public static void main(String args[]){
//creating objects
            StudentDefaultConstructor s1=new StudentDefaultConstructor();
            StudentDefaultConstructor s2=new StudentDefaultConstructor();
//displaying values of the object
            s1.display();
            s2.display();
        }
    }


