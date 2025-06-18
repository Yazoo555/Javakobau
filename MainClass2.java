// Carss class definition
class Carss {
    // Attributes of the Carss class
    String color;
    double price;

    // Constructor to initialize the attributes
    public Carss(String color, double price) {
        this.color = color;
        this.price = price;
    }

    // Method to display the Carss details
    public void displayCarDetails() {
        System.out.println("Car Color: " + color);
        System.out.println("Car Price: $" + price);
    }
}

// MainClass definition with the main method
public class MainClass2 {
    public static void main(String[] args) {
        // Providing values to the attributes of the Carss class
        String carColor = "Red";
        double carPrice = 25000.50;

        // Creating an object of the Carss class
        Carss myCar = new Carss(carColor, carPrice);

        // Displaying the values of the attributes of the Carss class
        System.out.println("Displaying Car Details:");
        myCar.displayCarDetails();
    }
}
