CCRM Application Usage Guide
This guide will walk you through the basic operations of the CCRM application.

1. Preparing Data Files
To test the Import functionality, you must first create a data folder in the root directory of your project.

File: data/students.csv
Create a file named students.csv inside the data folder with the following content:

id,fullName,email,regNo
1,Alice Johnson,alice@example.com,S001
2,Bob Williams,bob@example.com,S002
3,Charlie Brown,charlie@example.com,S003

2. Main Menu
When you run the application, you will see the main menu.

--- Main Menu ---
1. Manage Students
2. Manage Courses
3. Manage Enrollment & Grades
4. File Operations
5. Exit

3. Student Management (Option 1)
Add: Choose 1 and enter the student details as prompted.

List: Choose 2 to see all students you've added.

4. Course Management (Option 2)
Add: Choose 1 and enter the course code, title, and credits.

List: Choose 2 to see all courses you've added.

5. File Operations (Option 4)
Import: Choose 1 and enter the file path data/students.csv. The application will import the students from the file.

Export: Choose 2 and enter a file path (e.g., exported_students.csv). The application will create a file in the project's root directory with all current student data.

Backup: Choose 3. The application will create a timestamped backups folder and copy your exported files into it, demonstrating recursion for size calculation.