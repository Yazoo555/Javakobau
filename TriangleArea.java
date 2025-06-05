public class TriangleArea {
    public static void main(String[] args) {
        // Declare side lengths
        double a = 5;
        double b = 6;
        double c = 7;

        // Calculate semi-perimeter
        double s = (a + b + c) / 2;

        // Calculate area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Print result
        System.out.println("The area of the triangle is: " + area);
    }
}
