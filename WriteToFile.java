import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteToFile {
    public static void main(String[] args) {
        try {
            OutputStream output = new FileOutputStream("task3.txt");
            String text = "Java is a high level programming language";
            byte[] data = text.getBytes();
            output.write(data);
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
