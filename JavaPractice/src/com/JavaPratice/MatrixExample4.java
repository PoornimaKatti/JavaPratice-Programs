package com.JavaPratice;
import java.io.*;
import java.util.*;
public class MatrixExample4 {
    // Java program to print the elements of
// a 2 D array or matrix using deepToString()



        public static void print2D(int mat[][])
        {
            System.out.println(Arrays.deepToString(mat));
        }

        public static void main(String args[])
                throws IOException
        {
            int mat[][] = { { 1, 2, 3, 4 },
                    { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 } };
            print2D(mat);
        }
    }

