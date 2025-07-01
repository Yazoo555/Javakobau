// Question Number  3
abstract class Shape {
    abstract void getRectangleArea(int length, int breadth);
    abstract void getSquareArea(int side);
    abstract void getCircleArea(double radius);
}

// Subclass implementing all abstract methods
class Area extends Shape {
    @Override
    void getRectangleArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    @Override
    void getSquareArea(int side) {
        int area = side * side;
        System.out.println("Area of Square: " + area);
    }

    @Override
    void getCircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}

// Main class to test the functionality
public class Taskthree {
    public static void main(String[] args) {
        Area area = new Area();

        area.getRectangleArea(5, 10);  // Example input
        area.getSquareArea(4);         // Example input
        area.getCircleArea(3.5);       // Example input
    }
}
