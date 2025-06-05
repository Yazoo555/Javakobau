class Test {
    public static void main(String[] args) {
        System.out.println("Hello World, This is my first program in Java");

        int a = 6, b = 2, sum, pro, div, rem;
        sum = a + b;
        pro = a * b;
        div = a / b;
        rem = a % b;

        double celcius = 20, fh;
        fh = (9.0 / 5) * celcius + 32;

        // Calculate area of rectangle
        double length = 5.0, breadth = 10.0;
        double rectangleArea = length * breadth;

        // Calculate area of circle
        double radius = 7.0;
        double circleArea = Math.PI * radius * radius;

        // Calculate simple interest
        double principal = 1000.0;
        double rate = 5.0;  // rate of interest in percent
        double time = 3.0;  // time in years
        double simpleInterest = (principal * rate * time) / 100;

        // Logical AND expression
        boolean result = (5 > 3) && (8 > 100);
                boolean result2 = (500 > 3) && (888 > 100);


        // Output results
        System.out.println("Temp in Fahrenheit: " + fh);
        System.out.println("Sum of numbers is: " + sum);
        System.out.println("Product of numbers is: " + pro);
        System.out.println("Division of numbers is: " + div);
        System.out.println("Remainder of numbers is: " + rem);

        System.out.println("Area of rectangle: " + rectangleArea);
        System.out.println("Area of circle: " + circleArea);
        System.out.println("Simple interest: " + simpleInterest);

        System.out.println("Result of (5 > 3) && (8 > 100): " + result);
                System.out.println("Result of (500 > 3) && (888 > 100): " + result2);

    }
}
