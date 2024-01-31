package com.JavaPratice;
//Example intern(method)
//intern() method will return the String object reference from the string pool since
// we assign it back to s2 and now both s1 and s2 are having the same reference.
// It means that s1 and s2 references point to the same object.
public class StringExample7 {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = new String("hello");

        s2 = s2.intern();
        System.out.println(s1 == s2);
        System.out.println(s2);


        String s3 = new String("java");
        String s4 = new String("java");
        System.out.println(s3 == s4);
    }
}
