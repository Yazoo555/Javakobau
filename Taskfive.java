// Define the interface
interface Shape {
    double calculateArea();
}

// Circle class implementing Shape
class Circle implements Shape {
    private double radius;

    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implement calculateArea method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing Shape
class Rectangle implements Shape {
    private double length;
    private double width;

    // Constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implement calculateArea method
    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Main class to test
public class Taskfive {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);         // radius = 5
        Shape rectangle = new Rectangle(4.0, 6.0); // length = 4, width = 6

        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
    }
}
