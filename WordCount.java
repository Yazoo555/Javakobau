import java.io.*;

public class WordCount {
    public static void main(String[] args) {
        String filePath = "filename.txt"; // Replace with your file path
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Split line into words based on whitespace
                String[] words = line.trim().split("\\s+");
                if (words.length == 1 && words[0].isEmpty()) {
                    // Empty line, no words
                    continue;
                }
                wordCount += words.length;
            }

            System.out.println("Total number of words: " + wordCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
