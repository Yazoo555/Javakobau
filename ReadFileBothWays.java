import java.io.*;

public class ReadFileBothWays {
    public static void main(String[] args) {
        String filePath = "filename.txt";

        // Using BufferedReader (character stream)
        System.out.println("Reading with BufferedReader:");
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error using BufferedReader: " + e.getMessage());
        }

        // Using BufferedInputStream (byte stream)
        System.out.println("\nReading with BufferedInputStream:");
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath))) {
            StringBuilder line = new StringBuilder();
            int ch;
            while ((ch = bis.read()) != -1) {
                if (ch == '\n') {
                    System.out.println(line.toString());
                    line.setLength(0); // clear buffer
                } else if (ch != '\r') {
                    line.append((char) ch);
                }
            }
            // Print last line if it doesn't end with a newline
            if (line.length() > 0) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error using BufferedInputStream: " + e.getMessage());
        }
    }
}
