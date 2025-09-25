package edu.ccrm.util;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

// This class provides utility methods that demonstrate recursion.
public class RecursionUtils {
    
    // Recursively lists all files and directories within a given path.
    public static void listFilesRecursively(Path path) throws IOException {
        System.out.println(path.getFileName());

        // This is the recursive part of the method.
        // If the path is a directory, it will iterate through its contents
        // and call itself for each entry.
        if (Files.isDirectory(path)) {
            try (DirectoryStream<Path> stream = Files.newDirectoryStream(path)) {
                for (Path entry : stream) {
                    listFilesRecursively(entry);
                }
            }
        }
    }
}