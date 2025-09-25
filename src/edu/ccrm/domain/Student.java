package edu.ccrm.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

    // Add fields specific to a Student, separate from the Person's fields.
    private String regNo;
    private List<String> enrolledCourses; // A list to hold course codes
    private LocalDate enrollmentDate;

    // This constructor initializes the Student object.
    // The `super` keyword calls the constructor of the parent class (Person).
    public Student(String id, String fullName, String email, String regNo) {
        super(id, fullName, email); // Pass common fields to the parent constructor
        this.regNo = regNo;
        this.enrolledCourses = new ArrayList<>();
        this.enrollmentDate = LocalDate.now(); // Sets the current date
    }

    // This method is required because it's an abstract method in the parent class.
    // It must be implemented here. This is an example of Polymorphism.
    @Override
    public String getDetails() {
        // Return a formatted string with student-specific details
        return "Student: " + getFullName() + ", Reg No: " + regNo + ", Email: " + getEmail();
    }

    // This method is often used to get a simple, printable representation of the object.
    @Override
    public String toString() {
        // Provide a clear summary of the student.
        return "Student [regNo=" + regNo + ", fullName=" + getFullName() + ", email=" + getEmail() + "]";
    }
}
