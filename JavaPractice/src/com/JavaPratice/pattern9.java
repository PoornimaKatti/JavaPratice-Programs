package com.JavaPratice;

import java.util.Scanner;

public class pattern9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of rows you want in this pattern:");

        int rows = scanner.nextInt();

        System.out.println("----Pattern is----");

        for (int i = 1; i <= rows; i++)
        {
            for (int j = rows; j >= i; j--)
            {
                System.out.print(j+" ");
            }

            System.out.println();
        }


        scanner.close();
    }
}
