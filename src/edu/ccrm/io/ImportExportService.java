package edu.ccrm.io;

import edu.ccrm.domain.Student;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// This class handles importing and exporting data using Java NIO.2.
public class ImportExportService {

    // Imports student data from a CSV-like file.
    public List<Student> importStudents(String filePath) throws IOException {
        try (Stream<String> lines = Files.lines(Path.of(filePath))) {
            return lines.skip(1) // Skip the header row
                        .map(line -> {
                            String[] parts = line.split(",");
                            // Create and return a new Student object from the parsed parts.
                            String id = parts[0];
                            String fullName = parts[1];
                            String email = parts[2];
                            String regNo = parts[3];
                            
                            return new Student(id, fullName, email, regNo);
                        })
                        .collect(Collectors.toList());
        }
    }

    // Exports student data to a text file.
    public void exportStudents(String filePath, List<Student> students) throws IOException {
        List<String> lines = students.stream()
                                    .map(Student::toString) // Uses the toString() method to create a string representation
                                    .collect(Collectors.toList());
        Files.write(Path.of(filePath), lines);
        System.out.println("Exported " + students.size() + " students to " + filePath);
    }
}