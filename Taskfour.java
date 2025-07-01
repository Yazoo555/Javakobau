// Question Number 4
interface Employee {
    void printEmployeeId();
    void printSalary();
}

// Implementing class: Manager
class Manager implements Employee {
    private int employeeId;
    private double salary;

    // Constructor
    Manager(int employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public void printEmployeeId() {
        System.out.println("Manager ID: " + employeeId);
    }

    @Override
    public void printSalary() {
        System.out.println("Manager Salary: $" + salary);
    }
}

// Implementing class: Developer
class Developer implements Employee {
    private int employeeId;
    private double salary;

    // Constructor
    Developer(int employeeId, double salary) {
        this.employeeId = employeeId;
        this.salary = salary;
    }

    @Override
    public void printEmployeeId() {
        System.out.println("Developer ID: " + employeeId);
    }

    @Override
    public void printSalary() {
        System.out.println("Developer Salary: $" + salary);
    }
}

// Main class to test the implementation
public class Taskfour {
    public static void main(String[] args) {
        Employee manager = new Manager(101, 85000.0);
        Employee developer = new Developer(202, 70000.0);

        manager.printEmployeeId();
        manager.printSalary();

        developer.printEmployeeId();
        developer.printSalary();
    }
}
