package edu.ccrm.io;

import java.io.IOException;
import java.nio.file.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

// This class handles the backup and file system utilities using Java NIO.2.
public class BackupService {

    // Creates a timestamped backup folder and copies exported files into it.
    public void createBackup(List<Path> filesToBackup) throws IOException {
        String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        Path backupDir = Paths.get("backups", timestamp);

        // Check if the directory exists, and create it if it doesn't.
        if (!Files.exists(backupDir)) {
            Files.createDirectories(backupDir);
        }

        System.out.println("Creating backup at: " + backupDir.toAbsolutePath());

        // Copy each file to the new backup directory.
        for (Path sourceFile : filesToBackup) {
            Path destinationFile = backupDir.resolve(sourceFile.getFileName());
            Files.copy(sourceFile, destinationFile, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("Backed up: " + sourceFile.getFileName());
        }
    }

    // Recursively calculates the total size of a directory and its subdirectories.
    public long getDirectorySize(Path path) throws IOException {
        // This is a simple recursive method for file size calculation.
        // It demonstrates basic recursion logic.
        
        long size = 0;
        
        // If the path is a regular file, return its size.
        if (Files.isRegularFile(path)) {
            return Files.size(path);
        }

        // If it's a directory, iterate through its contents and recursively call this method.
        if (Files.isDirectory(path)) {
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
                for (Path entry : stream) {
                    size += getDirectorySize(entry);
                }
            }
        }

        return size;
    }
}