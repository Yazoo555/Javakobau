import java.io.*;

public class AppendToFile {
    public static void main(String[] args) {
        String filePath = "filename.txt"; // Target file
        String textToAppend = "This text will be appended to the file.\n";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.write(textToAppend);
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
