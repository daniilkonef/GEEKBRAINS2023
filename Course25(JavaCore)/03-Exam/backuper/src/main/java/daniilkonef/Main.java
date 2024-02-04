package daniilkonef;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

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
    public static void createBackupFolder() {
        String backupFolderPath = System.getProperty("user.dir") + File.separator + "backup";
        File backupFolder = new File(backupFolderPath);
        if (!backupFolder.exists()) {
            boolean success = backupFolder.mkdir();
            if (success) {
                System.out.println("Backup folder created successfully.");
            } else {
                System.err.println("Failed to create backup folder.");
            }
        } else {
            System.out.println("Backup folder already exists.");
        }
    }
    public static void copyFilesToBackupFolder() {
        String[] filesToCopy = getFilesInCurrentDirectory();
        String backupFolderPath = System.getProperty("user.dir") + File.separator + "backup";

        for (String fileName : filesToCopy) {
            Path sourcePath = Path.of(System.getProperty("user.dir"), fileName);
            Path targetPath = Path.of(backupFolderPath, fileName);

            try {
                Files.copy(sourcePath, targetPath, StandardCopyOption.REPLACE_EXISTING);
                System.out.println("Copied: " + fileName);
            } catch (IOException e) {
                System.err.println("Failed to copy: " + fileName);
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        String currentDirectory = System.getProperty("user.dir");
        System.out.println("Current Directory: " + currentDirectory);

        String[] files = getFilesInCurrentDirectory();
        for (String file : files) {
            System.out.println(file);
        }
        createBackupFolder();
        copyFilesToBackupFolder();

    }
}