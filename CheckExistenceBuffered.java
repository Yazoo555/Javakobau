import java.io.*;

public class CheckExistenceBuffered {
    public static void main(String[] args) {
        String inputFile = "filename.txt";     // Contains the path to check
        String outputFile = "output.txt";   // Will store the result

        try (
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String path = reader.readLine();  // Read path from file
            File file = new File(path);

            if (file.exists()) {
                writer.write("The file/directory exists.");
            } else {
                writer.write("The file/directory does not exist.");
            }

            System.out.println("Check completed. Result written to output.txt");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
