class PersonDetails {
    String name;
    int age;

    public PersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class EmployeeDetails extends PersonDetails {
    double salary;

    public EmployeeDetails(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + salary);
    }

    public void displayInfo1() {
        System.out.println("Salary: " + salary);
    }
}

class CompanyMain {
    public static void main(String[] args) {
        EmployeeDetails emp = new EmployeeDetails("Alex", 28, 48000.0);
        emp.displayInfo();
        emp.displayInfo1();
    }
}
