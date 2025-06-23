//Question number 15

public class MainVehicle {
    // Final class Vehicle
    public final static class Vehicle {
        public void start() {
            System.out.println("Vehicle is starting...");
        }
    }

 
    /*
    public static class Car extends Vehicle {
        public void start() {
            System.out.println("Car is starting...");
        }
    }
    */

    public static void main(String[] args) {
        Vehicle v = new Vehicle();
        v.start();
    }
}
