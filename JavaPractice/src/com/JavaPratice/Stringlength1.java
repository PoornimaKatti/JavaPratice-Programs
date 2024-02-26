package com.JavaPratice;

public class Stringlength1 {
    public static void main(String[] args) {
        String str = "Java";
        if(str.length()>0) {
            System.out.println("String is not empty and length is: "+str.length());
        }
        str = "";
        if(str.length()==0) {
            System.out.println("String is empty now: "+str.length());
        }
    }
}
