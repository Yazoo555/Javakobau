public class MainClass {
    public static void main(String[] args) {
        // Creating an object of Student
        Student student = new Student();

        // Setting values using setters
        student.setName("John Doe");
        student.setId(12345);
        student.setAge(20);

        // Printing values using getters
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Age: " + student.getAge());
    }
}
