import java.util.Stack;

public class TaskManager {
    public static void main(String[] args) {
        Stack<String> tasks = new Stack<>();

        tasks.push("Read");
        tasks.push("Write");
        tasks.push("Code");

        tasks.pop();

        tasks.push("Debug");
        tasks.push("Test");

        System.out.println("Top task: " + tasks.peek());

        System.out.println("Tasks stack:");
        for (String task : tasks) {
            System.out.println(task);
        }
    }
}
