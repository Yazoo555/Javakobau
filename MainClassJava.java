abstract class Vehicle {
    // Constructor
    public Vehicle() {
        System.out.println("Vehicle Created");
    }

    // Abstract method
    public abstract int maxSpeed();
}

class Car extends Vehicle {
    public Car() {
        System.out.println("Car Created");
    }

    @Override
    public int maxSpeed() {
        return 200;
    }
}

class Bike extends Vehicle {
    public Bike() {
        System.out.println("Bike Created");
    }

    @Override
    public int maxSpeed() {
        return 150;
    }
}

public class MainClassJava {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println("Car max speed: " + car.maxSpeed() + " km/h");

        Bike bike = new Bike();
        System.out.println("Bike max speed: " + bike.maxSpeed() + " km/h");
    }
}
