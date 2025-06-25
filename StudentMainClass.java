public class StudentMainClass {
    public static void main(String[] args) {
        // Create an object of Student
        Student student = new Student();

        // Set the attributes using setters
        student.setName("Alice");
        student.setId(101);
        student.setAge(20);

        // Get and print the attributes using getters
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Age: " + student.getAge());
    }
}
