// Abstract class Shape
abstract class Shape {
    // Abstract methods
    public abstract void calculateArea();
    public abstract void calculatePerimeter();
}

class Quadrilateral extends Shape {
    private double length;
    private double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        double area = length * width;
        System.out.println("Area of Quadrilateral (Rectangle): " + area);
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (length + width);
        System.out.println("Perimeter of Quadrilateral (Rectangle): " + perimeter);
    }
}

// Main class to test
public class AbstractMethod {
    public static void main(String[] args) {
        Quadrilateral rectangle = new Quadrilateral(5.0, 3.0);
        rectangle.calculateArea();      
        rectangle.calculatePerimeter();  
    }
}