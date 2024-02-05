package com.JavaPratice;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Number of rows you want in this pattern:");
        int rows = scanner.nextInt();
        System.out.println("----Pattern is----");
        for (int i = rows; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }

        scanner.close();
    }
}
