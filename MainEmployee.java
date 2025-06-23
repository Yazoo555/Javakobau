// Question number 4

public class MainEmployee  {
    // Superclass Person
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    // Subclass Employee that inherits from Person
    static class Employee extends Person {
        String employeeId;

        public Employee(String name, int age, String employeeId) {
            super(name, age); // Call superclass constructor
            this.employeeId = employeeId;
        }

        // Override displayInfo to include employeeId
        @Override
        public void displayInfo() {
            super.displayInfo(); // Call Person's displayInfo
            System.out.println("Employee ID: " + employeeId);
        }
    }

    public static void main(String[] args) {
        Employee e = new Employee("Yajju", 24, "EMP#785");
        e.displayInfo();
    }
}
