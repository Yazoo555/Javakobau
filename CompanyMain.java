class PersonDetails {
    String name;
    int age;

    // Constructor
    public PersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Worker extends PersonDetails {
    double salary;

    public Worker(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void displaySalaryInfo() {
        System.out.println("Salary: " + salary);
    }
}

public class CompanyMain {
    public static void main(String[] args) {
        Worker worker1 = new Worker("Alex", 28, 48000.0);
        worker1.displayInfo();
        worker1.displaySalaryInfo();
    }
}
