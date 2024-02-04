package daniilkonef;
import java.io.File;

public class Main {
    public static String[] getFilesInCurrentDirectory() {
        File currentDirectory = new File(System.getProperty("user.dir"));
        File[] files = currentDirectory.listFiles(File::isFile);

        if (files != null) {
            String[] fileNames = new String[files.length];
            for (int i = 0; i < files.length; i++) {
                fileNames[i] = files[i].getName();
            }
            return fileNames;
        } else {
            return new String[0];
        }
    }

    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Current Directory: " + currentDirectory);

        String[] files = getFilesInCurrentDirectory();
        for (String file : files) {
            System.out.println(file);
        }
    }
}