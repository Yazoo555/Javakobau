import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Scanner;

class Student {
    String firstName;
    String lastName;
    String address;
    String contactNumber;
    String semester;

    public Student(String firstName, String lastName, String address, String contactNumber, String semester) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.contactNumber = contactNumber;
        this.semester = semester;
    }

    public String toCSV() {
        return firstName + "," + lastName + "," + address + "," + contactNumber + "," + semester;
    }
}

public class StudentCSVWriter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("students.csv"))) {
            bw.write("FirstName,LastName,Address,ContactNumber,Semester");
            bw.newLine();

            System.out.print("Enter number of students: ");
            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                System.out.print("First Name: ");
                String firstName = scanner.nextLine();

                System.out.print("Last Name: ");
                String lastName = scanner.nextLine();

                System.out.print("Address: ");
                String address = scanner.nextLine();

                System.out.print("Contact Number: ");
                String contactNumber = scanner.nextLine();

                System.out.print("Semester: ");
                String semester = scanner.nextLine();

                Student student = new Student(firstName, lastName, address, contactNumber, semester);
                bw.write(student.toCSV());
                bw.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        scanner.close();
    }
}
