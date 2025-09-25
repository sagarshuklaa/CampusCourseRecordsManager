**Campus Course & Records Manager (CCRM) Project Overview**

Campus Course & Records Manager (CCRM) is a robust, console-based Java application purpose-built for managing student, course, and academic records within an educational institution. Developed with Java SE 21, this project highlights mastery of object-oriented programming principles, modern file I/O (NIO.2), and essential design patterns. CCRM streamlines student and course management, enrollment workflows, grade tracking, transcript generation, and data backup — providing a professional, extensible solution for campus record-keeping.


**Key Features**

1) Add, list, update, and search student records efficiently.
2) Register, view, and edit course details; handle prerequisites and credit limits.
3) Enroll students in courses, record grades, and auto-generate academic transcripts.
4) Import/export CSV data, create timestamped backups, and restore from backup for data safety.

Demonstrates advanced OOP concepts (abstraction, inheritance, polymorphism), custom exceptions, builder/singleton design patterns, and the java.time API for date handling.

**Setup & Installation**

*Java Environment:* Requires Java Development Kit (JDK) 21. Ensure JavaSE-21 is set as the Project JRE.

**Running the App:**

1) Open in Eclipse IDE.
2) Set JRE System Library to JavaSE-21 (Project > Properties > Java Build Path).
3) Run Main.java in edu.ccrm.cli as a Java Application.

**Technical Highlights**

1) Uses encapsulation (private class fields with getters/setters).
2) Abstract and inherited classes (Person, Student, Instructor).
3) Polymorphic methods across entities.
4) Singleton (AppConfig), Builder (Course), and custom exception patterns.
5) Modern file I/O (NIO.2) for import/export and recursive backups.
6) Enum types for grades, LocalDate for timestamps, and advanced string/array parsing.

**Documentation & Usage**

See USAGE.md for step-by-step instructions, sample commands, and example data files to operate CCRM, ensuring a smooth learning curve for new contributors and users.

