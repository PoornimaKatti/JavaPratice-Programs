package com.JavaPratice;
    import java.util.ArrayList;

    public class DoubleArrayListExample {
        public static void main(String[] args) {
            ArrayList<Double> values = new ArrayList<>();
            values.add(3.14);
            values.add(2.718);
            values.add(1.618);

            System.out.println("Elements in Double ArrayList:");
            for (double value : values) {
                System.out.println(value);
            }
        }
    }


