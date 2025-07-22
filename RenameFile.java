import java.io.File;

public class RenameFile {
    public static void main(String[] args) {
        File oldFile = new File("oldName.txt");
        File newFile = new File("newName.txt");
        oldFile.renameTo(newFile);
    }
}
