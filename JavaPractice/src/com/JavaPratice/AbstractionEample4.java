package com.JavaPratice;

    // IgnitionSystem.java
// Abstract class representing the ignition system
    abstract class IgnitionSystem {
        abstract void start();
    }

    // Car.java
// Class representing a car with an ignition system
    class Car {
        private IgnitionSystem ignition;

        public Car(IgnitionSystem ignition) {
            this.ignition = ignition;
        }

        public void startCar() {
            ignition.start();
        }
    }

    // KeyIgnition.java
// Concrete implementation of the ignition system using a key
    class KeyIgnition extends IgnitionSystem {
        @Override
        void start() {
            System.out.println("Turn the key to start the car.");
            // Code to start the car's engine would go here
        }
    }

    // ButtonIgnition.java
// Concrete implementation of the ignition system using a start button
    class ButtonIgnition extends IgnitionSystem {
        @Override
        void start() {
            System.out.println("Press the ignition button to start the car.");
            // Code to start the car's engine would go here
        }
    }

    // Main.java
    public class AbstractionEample4  {
        public static void main(String[] args) {
            // Creating a car with key ignition
            Car carWithKeyIgnition = new Car(new KeyIgnition());
            carWithKeyIgnition.startCar(); // Output: Turn the key to start the car.

            // Creating a car with button ignition
            Car carWithButtonIgnition = new Car(new ButtonIgnition());
            carWithButtonIgnition.startCar(); // Output: Press the ignition button to start the car.
        }
    }


