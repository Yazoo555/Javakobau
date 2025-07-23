class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display name and age
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Employee extends Person {
    double salary;

    // Constructor calling super to initialize name and age
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    // Override displayInfo to add salary info
    @Override
    public void displayInfo() {
        super.displayInfo();  // call parent displayInfo
        System.out.println("Salary: " + salary);
    }
}

public class MainClassHere {
    public static void main(String[] args) {
        Employee emp = new Employee("John Doe", 35, 75000.0);
        emp.displayInfo();
    }
}
