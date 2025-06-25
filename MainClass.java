// Student.java
class Student {
    // Private attributes
    private String name;
    private int id;
    private int age;

    // Getter and Setter for 'name'
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for 'id'
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Getter and Setter for 'age'
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

// MainClass.java
public class MainClass {
    public static void main(String[] args) {
        // Create an object of Student
        Student student = new Student();

        // Set the values using setter methods
        student.setName("John Doe");
        student.setId(12345);
        student.setAge(20);

        // Print the values using getter methods
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Age: " + student.getAge());
    }
}
