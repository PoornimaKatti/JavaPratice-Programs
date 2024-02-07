package com.JavaPratice;

    // Interface defining common methods for vehicles
    interface Vehicle {
        void start();
        void stop();
    }

    // Concrete class representing a Car
    class Car implements Vehicle {
        @Override
        public void start() {
            System.out.println("Car started.");
        }

        @Override
        public void stop() {
            System.out.println("Car stopped.");
        }
    }

    // Concrete class representing a Motorcycle
    class Motorcycle implements Vehicle {
        @Override
        public void start() {
            System.out.println("Motorcycle started.");
        }

        @Override
        public void stop() {
            System.out.println("Motorcycle stopped.");
        }
    }

    // Main class to demonstrate the usage of vehicles
    public class VehicleInterface1 {
        public static void main(String[] args) {
            Vehicle car = new Car();
            Vehicle motorcycle = new Motorcycle();

            car.start();
            car.stop();

            motorcycle.start();
            motorcycle.stop();
        }
    }


