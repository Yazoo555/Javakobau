// Car class definition
class Car {
    // Attributes of the Car class
    String color;
    double price;

    // Constructor to initialize the attributes
    public Car(String color, double price) {
        this.color = color;
        this.price = price;
    }

    // Method to display the Car details
    public void displayCarDetails() {
        System.out.println("Car Color: " + color);
        System.out.println("Car Price: $" + price);
    }
}

// MainClass definition with the main method
public class MainClass1 {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car("Blue", 30000.75);

        // Displaying the details of the car
        myCar.displayCarDetails();
    }
}
