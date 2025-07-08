import java.util.ArrayList;
import java.util.Collections;

public class StudentListReverser {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        studentList.add("Yajju");
        studentList.add("Raju");
        studentList.add("Monalisa");
        studentList.add("Diana");

        Collections.reverse(studentList);

        for (String student : studentList) {
            System.out.println(student);
        }
    }
}
