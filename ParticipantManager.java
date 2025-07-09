import java.util.ArrayList;

public class ParticipantManager {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Ram");
        students.add("Bahadur");
        students.add("Shyam");
        students.add("Pooja");
        students.add("Nani maiya");
        students.remove("Shyam Bahadur");

        ArrayList<String> examinees = new ArrayList<>();
        examinees.add("Ritesh");
        examinees.add("Shaurabh");
        examinees.add("Aayush");
        examinees.add("Pranish");
        examinees.add("Yajju");
        examinees.remove("Nissan");

        System.out.println("Students:");
        for(String student : students) {
            System.out.println(student);
        }

        System.out.println("Examinees:");
        for(String name : examinees) {
            System.out.println(name);
        }
    }
}
