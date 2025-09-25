package edu.ccrm.cli;

import edu.ccrm.config.AppConfig;
import edu.ccrm.domain.*;
import edu.ccrm.io.BackupService;
import edu.ccrm.io.ImportExportService;
import edu.ccrm.service.*;
import edu.ccrm.util.RecursionUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentService studentService = new StudentService();
    private static CourseService courseService = new CourseService();
    private static EnrollmentService enrollmentService = new EnrollmentService();
    private static TranscriptService transcriptService = new TranscriptService();
    private static ImportExportService ioService = new ImportExportService();
    private static BackupService backupService = new BackupService();

    public static void main(String[] args) {
        // Initialize the Singleton AppConfig instance.
        AppConfig config = AppConfig.getInstance();
        
        System.out.println("Welcome to the Campus Course & Records Manager!");
        
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\n--- Main Menu ---");
            System.out.println("1. Manage Students");
            System.out.println("2. Manage Courses");
            System.out.println("3. Manage Enrollment & Grades");
            System.out.println("4. File Operations");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume the newline

                switch (choice) {
                    case 1:
                        studentManagementMenu();
                        break;
                    case 2:
                        courseManagementMenu();
                        break;
                    case 3:
                        enrollmentAndGradesMenu();
                        break;
                    case 4:
                        fileOperationsMenu();
                        break;
                    case 5:
                        isRunning = false;
                        System.out.println("Exiting application. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 5.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear the invalid input from the scanner
            }
        }
    }

    private static void studentManagementMenu() {
        boolean inStudentMenu = true;
        while (inStudentMenu) {
            System.out.println("\n--- Student Management ---");
            System.out.println("1. Add a new student");
            System.out.println("2. List all students");
            System.out.println("3. Go back to main menu");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addStudent();
                        break;
                    case 2:
                        listStudents();
                        break;
                    case 3:
                        inStudentMenu = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 3.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    private static void addStudent() {
        System.out.println("\n--- Add New Student ---");
        System.out.print("Enter student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter full name: ");
        String name = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        System.out.print("Enter registration number: ");
        String regNo = scanner.nextLine();
        
        Student newStudent = new Student(id, name, email, regNo);
        studentService.addStudent(newStudent);
    }

    private static void listStudents() {
        System.out.println("\n--- All Students ---");
        List<Student> students = studentService.listAllStudents();
        if (students.isEmpty()) {
            System.out.println("No students found.");
        } else {
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }

    private static void courseManagementMenu() {
        boolean inCourseMenu = true;
        while (inCourseMenu) {
            System.out.println("\n--- Course Management ---");
            System.out.println("1. Add a new course");
            System.out.println("2. List all courses");
            System.out.println("3. Go back to main menu");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        addCourse();
                        break;
                    case 2:
                        listCourses();
                        break;
                    case 3:
                        inCourseMenu = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 3.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    private static void addCourse() {
        System.out.println("\n--- Add New Course ---");
        System.out.print("Enter course code: ");
        String code = scanner.nextLine();
        System.out.print("Enter course title: ");
        String title = scanner.nextLine();
        System.out.print("Enter credits: ");
        int credits = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        // Use the Builder pattern to create the Course object.
        Course newCourse = new Course.Builder(code, title)
                                    .withCredits(credits)
                                    .build();
        courseService.addCourse(newCourse);
    }

    private static void listCourses() {
        System.out.println("\n--- All Courses ---");
        List<Course> courses = courseService.listAllCourses();
        if (courses.isEmpty()) {
            System.out.println("No courses found.");
        } else {
            for (Course course : courses) {
                System.out.println(course);
            }
        }
    }

    private static void enrollmentAndGradesMenu() {
        boolean inEnrollmentMenu = true;
        while (inEnrollmentMenu) {
            System.out.println("\n--- Enrollment & Grades ---");
            System.out.println("1. Enroll a student in a course");
            System.out.println("2. Record a grade");
            System.out.println("3. Print a transcript");
            System.out.println("4. Go back to main menu");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        // TODO: Call a method to enroll a student.
                        break;
                    case 2:
                        // TODO: Call a method to record a grade.
                        break;
                    case 3:
                        // TODO: Call a method to print a transcript.
                        break;
                    case 4:
                        inEnrollmentMenu = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    private static void fileOperationsMenu() {
        boolean inFileMenu = true;
        while (inFileMenu) {
            System.out.println("\n--- File Operations ---");
            System.out.println("1. Import students from file");
            System.out.println("2. Export student data to file");
            System.out.println("3. Create a backup of all data");
            System.out.println("4. Go back to main menu");
            System.out.print("Enter your choice: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        importStudents();
                        break;
                    case 2:
                        exportStudents();
                        break;
                    case 3:
                        createBackup();
                        break;
                    case 4:
                        inFileMenu = false;
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
    }

    private static void importStudents() {
        System.out.print("Enter the file path to import from (e.g., data/students.csv): ");
        String filePath = scanner.nextLine();
        try {
            List<Student> importedStudents = ioService.importStudents(filePath);
            for (Student student : importedStudents) {
                studentService.addStudent(student);
            }
            System.out.println("Successfully imported " + importedStudents.size() + " students.");
        } catch (IOException e) {
            System.out.println("Error importing students: " + e.getMessage());
        }
    }

    private static void exportStudents() {
        System.out.print("Enter the file path to export to (e.g., data/exported_students.csv): ");
        String filePath = scanner.nextLine();
        try {
            ioService.exportStudents(filePath, studentService.listAllStudents());
        } catch (IOException e) {
            System.out.println("Error exporting students: " + e.getMessage());
        }
    }

    private static void createBackup() {
        try {
            Path exportedStudentsPath = Paths.get("exported_students.csv");
            
            // Check if the file exists before backing it up.
            if (Files.exists(exportedStudentsPath)) {
                backupService.createBackup(List.of(exportedStudentsPath));
                long backupSize = backupService.getDirectorySize(Paths.get("backups"));
                System.out.println("Total backup size: " + backupSize + " bytes.");
            } else {
                System.out.println("No exported data to back up. Please export data first.");
            }
        } catch (IOException e) {
            System.out.println("Error creating backup: " + e.getMessage());
        }
    }
}