package com.JavaPratice;

import java.util.ArrayList;

//Custom Object ArrayList Example:
public class ArrayListExample1 {
    public static void main(String[] args) {
        ArrayList<Object> ar = new ArrayList<>();
        ar.add("Hello");
        ar.add(42);
        ar.add(3.14);

        System.out.println("Elements in Mixed-type ArrayList:");
        for (Object obj : ar) {
            System.out.println(obj);
        }
    }
}
