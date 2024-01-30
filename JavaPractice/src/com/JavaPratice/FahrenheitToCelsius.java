package com.JavaPratice;
import java.util.*;
public class FahrenheitToCelsius {
    public static void main(String[] args) {
        float temperatue;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the temperature in Fahrenheit:");
        temperatue=in.nextInt();
        temperatue=((temperatue-32)*5)/9;
        System.out.println("Temperature in celsius="+temperatue);
    }
}
