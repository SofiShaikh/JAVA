class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car is starting with key ignition");
    }
}

class Bike extends Vehicle {
    @Override
    void start() {
        System.out.println("Bike is starting with kick start");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle();
        v1.start();   // Vehicle is starting...

        Vehicle v2 = new Car();
        v2.start();   // Car is starting with key ignition

        Vehicle v3 = new Bike();
        v3.start();   // Bike is starting with kick start
    }
}
