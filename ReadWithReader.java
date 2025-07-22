import java.io.FileReader;
import java.io.Reader;

public class ReadWithReader {
    public static void main(String[] args) {
        try {
            Reader reader = new FileReader("task3.txt");
            int data;
            while ((data = reader.read()) != -1) {
                System.out.print((char) data);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
