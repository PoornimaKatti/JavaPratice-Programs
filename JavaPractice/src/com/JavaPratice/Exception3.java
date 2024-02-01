package com.JavaPratice;

public class Exception3 {
    public static void main(String[] args) {
        try{
            int i;
            return;
        }
        catch(Exception e){
            System.out.print("inCatchBlock");
        }
        finally{
            System.out.println("inFinallyBlock");
        }
    }
}
