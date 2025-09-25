package edu.ccrm.domain;

public class Instructor extends Person {

    // Add fields specific to an Instructor.
    private String department;

    // This constructor initializes the Instructor object.
    // The 'super' keyword calls the parent class constructor to set the common fields.
    public Instructor(String id, String fullName, String email, String department) {
        super(id, fullName, email);
        this.department = department;
    }

    // Override the abstract getDetails() method.
    // The implementation is different from the Student class, demonstrating polymorphism.
    @Override
    public String getDetails() {
        return "Instructor: " + getFullName() + ", Department: " + department + ", Email: " + getEmail();
    }
}
