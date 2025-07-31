//Question number 2

import java.io.File;

public class CheckExistence {
    public static void main(String[] args) {
        // Specify the path to check
        String path = "example.txt"; // Change this to any file or directory path
        File file = new File(path);

        if (file.exists()) {
            System.out.println("The file/directory exists.");
        } else {
            System.out.println("The file/directory does not exist.");
        }
    }
}
