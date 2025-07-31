import java.io.*;
import java.util.*;

class Student {
    String firstName;
    String lastName;
    String address;
    String contactNumber;
    int semester;

    public Student(String firstName, String lastName, String address, String contactNumber, int semester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.semester = semester;
    }

    // Convert student data to CSV format line
    public String toCSV() {
        // Escape commas in address if needed
        return String.join(",", firstName, lastName, address.replace(",", ";"), contactNumber, String.valueOf(semester));
    }
}

public class StudentCSVWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();

        System.out.print("How many students do you want to enter? ");
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for student " + (i + 1) + ":");

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Address: ");
            String address = scanner.nextLine();

            System.out.print("Contact Number: ");
            String contactNumber = scanner.nextLine();

            System.out.print("Semester: ");
            int semester = Integer.parseInt(scanner.nextLine());

            students.add(new Student(firstName, lastName, address, contactNumber, semester));
        }

        writeToCSV(students, "students.csv");
        System.out.println("\nStudent data written to students.csv");
    }

    public static void writeToCSV(List<Student> students, String fileName) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            // Write CSV header
            bw.write("FirstName,LastName,Address,ContactNumber,Semester");
            bw.newLine();

            // Write student data
            for (Student s : students) {
                bw.write(s.toCSV());
                bw.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error writing to CSV file: " + e.getMessage());
        }
    }
}
