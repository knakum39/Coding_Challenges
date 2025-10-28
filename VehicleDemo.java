package Java_coding_challenges;

// Base class
class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Subclass 1
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with a key ignition...");
    }
}

// Subclass 2
class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with a self start or kick...");
    }
}

// Main class to test
public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle v1 = new Car();   // Upcasting
        Vehicle v2 = new Bike();  // Upcasting

        v1.start();  // Calls Car's start()
        v2.start();  // Calls Bike's start()
    }
}
