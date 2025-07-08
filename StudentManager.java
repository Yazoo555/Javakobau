import java.util.ArrayList;

public class StudentManager {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();

        studentList.add("Yajju");
        studentList.add("Yajju Chansi");
        studentList.add("Yajju Shrestha");
        studentList.add("Yazzu");

        System.out.println("Students after adding:");
        printStudents(studentList);
 
        studentList.remove("Yajju");  // Remove by name
        // Or: studentList.remove(2);  // Remove by index

        System.out.println("\nStudents after removing Yajju:");
        printStudents(studentList);
    }

    public static void printStudents(ArrayList<String> students) {
        for (String student : students) {
            System.out.println(student);
        }
    }
}
