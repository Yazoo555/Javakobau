import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class CopyFile {
    public static void main(String[] args) {
        try {
            BufferedInputStream input = new BufferedInputStream(new FileInputStream("source.txt"));
            BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream("destination.txt"));
            int data;
            while ((data = input.read()) != -1) {
                output.write(data);
            }
            input.close();
            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
