package com.JavaPratice;

public class Exception5 {

        public static void main(String args[]){
            int i;
            try{
                i = calculate();
                System.out.println(i);
            }catch(Exception e){
                System.out.println("Error occured");
            }
        }

        static int calculate(){
            return (7/2);
        }
    }

