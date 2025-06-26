// Employee class (Subclass of Person)
public class Employee extends Person {
    // Additional attribute for Employee
    private String department;

    // Constructor for Employee class
    public Employee(String address, String department) {
        // Calling the constructor of the Person class using super
        super(address);
        this.department = department;
    }

    // Getter method for department
    public String getDepartment() {
        return department;
    }

    // Overriding displayPersonDetails to include department
    @Override
    public void displayPersonDetails() {
        // Calling the parent class method to display address
        super.displayPersonDetails();
        System.out.println("Department: " + department);
    }
}
