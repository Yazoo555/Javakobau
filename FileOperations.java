import java.io.File;

public class FileOperations {
    public static void main(String[] args) {
        File file = new File("myFile.txt");
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Readable: " + file.canRead());
    }
}
