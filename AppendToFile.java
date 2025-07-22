import java.io.FileWriter;
import java.io.IOException;

public class AppendToFile {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("task3.txt", true);
            writer.write(" Appended text.");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
