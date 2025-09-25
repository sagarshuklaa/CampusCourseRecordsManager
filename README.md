**Campus Course & Records Manager (CCRM)**

**Project Overview:**

The Campus Course & Records Manager (CCRM) is a console-based Java application designed to manage student and course data for an academic institution. This project was developed as a Java SE application to demonstrate proficiency in core Java concepts, object-oriented programming (OOP), modern file I/O, and common design patterns.

**The application allows users to:**

1) Manage Students: Add, list, and update student records.
2) Manage Courses: Add, list, and manage course data.
3) Handle Enrollment & Grades: Enroll students in courses, record grades, and generate transcripts.
4) Perform File Operations: Import/export data from simple CSV files and create timestamped backups.

**Setup and Installation:**

*Java Environment:*

This project was developed using Java Development Kit (JDK) 21. To run it, you must have JDK 21 installed and configured on your system.

*Running the Application:*

1) Open in Eclipse: Open this project in Eclipse IDE.
2) Ensure JDK 21 is configured: Right-click the project in Package Explorer, go to Properties > Java Build Path, and ensure the JRE System Library is set to JavaSE-21.
3) Run: Right-click the Main.java file in edu.ccrm.cli and select Run As > Java Application. The program will start in the console.

**Project Features and Demonstrations:**

This project demonstrates several mandatory technical requirements from the project brief.

1) **Encapsulation:** Person.java (private fields with public getters)
2) **Inheritance:** Student.java and Instructor.java (extending Person)
3) **Abstraction:** Person.java (abstract class and method)
4) **Polymorphism:** Student.java and Instructor.java (overriding getDetails())
5) **Singleton Pattern:** AppConfig.java (getInstance() method)
6) **Builder Pattern:** Course.java (nested Builder class)
7) **Enums with Fields:** Grade.java (with gradePoint field and constructor)
8) **Modern I/O (NIO.2):** ImportExportService.java, BackupService.java
9) **Recursion:** BackupService.java (in getDirectorySize() method)
10) **Custom Exceptions:** DuplicateEnrollmentException, MaxCreditLimitExceededException
11) **java.time API:** Student.java (using LocalDate for enrollment date)
12) **Arrays & String Methods:** Main.java (parsing input, using split() and join())

**How to Use:**

Please refer to the USAGE.md file for a step-by-step guide on how to use the CCRM application, including sample commands and data formats.