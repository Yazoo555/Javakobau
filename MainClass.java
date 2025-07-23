public class MainClass {
    public static void main(String[] args) {
        // Create object of Student
        Student student1 = new Student();

        // Set values using setters
        student1.setName("Alice");
        student1.setId("S12345");
        student1.setAge(20);

        // Get and print values using getters
        System.out.println("Student Name: " + student1.getName());
        System.out.println("Student ID: " + student1.getId());
        System.out.println("Student Age: " + student1.getAge());
    }
}
