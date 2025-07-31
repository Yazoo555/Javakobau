//Question Number 1

import java.io.File;
import java.io.IOException;

public class FileDetails {
    public static void main(String[] args) {
        File file = new File("filename.txt");

        try {
            // Create the file if it doesn't exist
            if (file.createNewFile()) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }

            // Retrieve and print file details
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Can Read: " + file.canRead());
            System.out.println("Can Write: " + file.canWrite());

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
