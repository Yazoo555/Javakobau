import java.io.FileWriter;
import java.io.Writer;

public class WriteWithWriter {
    public static void main(String[] args) {
        try {
            Writer writer = new FileWriter("task3.txt");
            writer.write("Java is a high level programming language");
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
