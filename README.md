
***
# CampusCourseRecordsManager (CCRM)

## Project Overview
Campus Course & Records Manager (CCRM) is a console-based Java application designed to efficiently manage students, courses, enrollment, and academic records in an educational institution. It demonstrates advanced use of core Java features and object-oriented programming principles, providing a professional and extensible solution for campus administrative tasks.

## Key Features
- Add, list, update, and search student records.
- Manage course details including prerequisites and credit limits.
- Enroll students in courses and record grades.
- Generate academic transcripts automatically.
- Import and export data using CSV files.
- Create timestamped backups and restore data safely.
- Implements design patterns such as Singleton, Builder, and custom exceptions.
- Uses modern Java SE 21 capabilities, including the java.time API and NIO.2.

## Implementation Approach
- Object-Oriented Design: Core entities like Person, Student, and Instructor are represented by abstract and inherited classes, showcasing polymorphism and encapsulation.
- Design Patterns: Singleton pattern for configuration management and Builder pattern for flexible course creation.
- Robust File Handling: Uses Java NIO.2 for non-blocking file operations and safe data handling during imports, exports, and backups.
- Enumerations and Date API: Grades are handled with enums for clarity, and timestamps use the LocalDate API for accuracy.
- Exception Handling: Custom exceptions ensure graceful error recovery and better debugging.

## Setup & Installation

### Prerequisites
- Java Development Kit (JDK) 21 or higher installed.
- Eclipse IDE (recommended) or any Java IDE that supports Java SE 21.

### Running the Application
1. Clone or download this repository.
2. Open Eclipse and import the project:
   - Select **File > Import > Existing Projects into Workspace**.
   - Browse to the cloned/downloaded project location.
   - Finish the import process.
3. Set the Java JRE System Library to JavaSE-21:
   - Right-click the project → **Properties > Java Build Path > Libraries**.
   - Remove the existing JRE and add JavaSE-21.
4. Navigate to `edu.ccrm.cli.Main.java`.
5. Run `Main.java` as a Java Application.

## Usage
- Follow the interactive console prompts to add students, courses, enrollments, and grades.
- Use the import/export feature to handle bulk data operations via CSV files.
- Backups are stored with timestamps for easy data recovery.

## Additional Notes
- Refer to the `USAGE.md` file for detailed commands and examples.
- Ensure data integrity by regularly backing up using the integrated feature.

***

This README covers the essential aspects that help users set up, understand the design, and effectively run the CampusCourseRecordsManager project. If needed, sections like contribution guidelines or license details can be added later.

[1](https://github.com/sagarshuklaa/CampusCourseRecordsManager)

