// Last Question 

public class MainAreaCalculator  {
    // AreaCalculator class with overloaded calculateArea methods
    static class AreaCalculator {

        // Rectangle: length × width
        public void calculateArea(double length, double width) {
            double area = length * width;
            System.out.println("Area of rectangle: " + area);
        }

        // Square: side × side
        public void calculateArea(double side) {
            double area = side * side;
            System.out.println("Area of square: " + area);
        }

        // Triangle: 0.5 × base × height
        public void calculateArea(double base, double height, boolean isTriangle) {
            double area = 0.5 * base * height;
            System.out.println("Area of triangle: " + area);
        }
    }

    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        calculator.calculateArea(5.0, 3.0);                 // Rectangle
        calculator.calculateArea(4.0);                      // Square
        calculator.calculateArea(6.0, 2.5, true);           // Triangle
    }
}
