import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteWithBufferedWriter {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("task3.txt"));
            writer.write("Java is a high level programming language");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
