public class TxtFileChecker {
    public static boolean isTxtFile(String filename) {
        return filename != null && filename.toLowerCase().endsWith(".txt");
    }

    public static void main(String[] args) {
        System.out.println(isTxtFile("document.txt"));  // true
        System.out.println(isTxtFile("image.png"));     // false
        System.out.println(isTxtFile("notes.TXT"));     // true
    }
}
