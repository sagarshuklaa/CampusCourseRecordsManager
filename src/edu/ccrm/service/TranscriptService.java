package edu.ccrm.service;

import edu.ccrm.domain.Enrollment;
import edu.ccrm.domain.Grade;
import edu.ccrm.domain.Student;
import java.util.List;

// This class handles all business logic for transcripts and GPA calculation.
public class TranscriptService {

    // This method computes a student's GPA based on their enrolled courses and grades.
    public double computeGPA(Student student, List<Enrollment> enrollments) {
        double totalGradePoints = 0.0;
        int totalCredits = 0;

        for (Enrollment enrollment : enrollments) {
            // Check if the enrollment belongs to the given student and has a grade.
            if (enrollment.getStudent().equals(student) && enrollment.getGrade() != null) {
                totalGradePoints += enrollment.getGrade().getGradePoint() * enrollment.getCourse().getCredits();
                totalCredits += enrollment.getCourse().getCredits();
            }
        }

        if (totalCredits == 0) {
            return 0.0; // Avoid division by zero
        }
        
        return totalGradePoints / totalCredits;
    }

    // This method generates and prints a student's full transcript.
    public void printTranscript(Student student, List<Enrollment> enrollments) {
        System.out.println("\n--- Transcript for " + student.getFullName() + " ---");
        
        for (Enrollment enrollment : enrollments) {
            if (enrollment.getStudent().equals(student)) {
                System.out.println(enrollment.getCourse().getTitle() + ": " + enrollment.getGrade());
            }
        }
        
        double gpa = computeGPA(student, enrollments);
        System.out.printf("Overall GPA: %.2f\n", gpa);
        System.out.println("----------------------------------------");
    }
}