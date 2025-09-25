package edu.ccrm.service;

import edu.ccrm.domain.Course;
import edu.ccrm.domain.Enrollment;
import edu.ccrm.domain.Grade;
import edu.ccrm.domain.Student;
import java.util.ArrayList;
import java.util.List;

// This class handles all business logic related to enrollment and grading.
public class EnrollmentService {

    // This list will store all the enrollment records.
    private List<Enrollment> enrollments = new ArrayList<>();
    
    // A simple business rule: students can't enroll in more than 15 credits per semester.
    private static final int MAX_CREDITS_PER_SEMESTER = 15;

    // Enroll a student in a course, with business rule checks.
    public void enrollStudent(Student student, Course course) throws Exception {
        // TODO: Implement business rule check for max credits.
        // HINT: Get the student's current enrolled credits and check if adding this course's credits will exceed the limit.
        int currentCredits = 0; // TODO: Calculate the student's total credits here.
        
        if (currentCredits + course.getCredits() > MAX_CREDITS_PER_SEMESTER) {
            // TODO: Throw a custom exception here.
            throw new Exception("Max credit limit exceeded for the semester.");
        }

        // TODO: Check if the student is already enrolled in the course.
        // If so, throw a custom exception.
        // HINT: Iterate through the enrollments list and check if an enrollment for this student and course already exists.
        
        Enrollment enrollment = new Enrollment(student, course);
        enrollments.add(enrollment);
        System.out.println("Enrollment successful for " + student.getFullName() + " in " + course.getTitle());
    }

    // Record a grade for a specific enrollment.
    public void recordGrade(Student student, Course course, Grade grade) {
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudent().equals(student) && enrollment.getCourse().equals(course)) {
                enrollment.setGrade(grade);
                System.out.println("Grade '" + grade.name() + "' recorded for " + student.getFullName() + " in " + course.getTitle());
                return;
            }
        }
        System.out.println("Error: Enrollment not found for " + student.getFullName() + " in " + course.getTitle());
    }

    // Get all enrollments.
    public List<Enrollment> listAllEnrollments() {
        return enrollments;
    }
}