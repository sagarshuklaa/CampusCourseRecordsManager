package edu.ccrm.domain;

public class Enrollment {

    private Student student;
    private Course course;
    private Grade grade; // Can be null initially

    // Constructor to create an enrollment record
    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    // Getters
    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }

    public Grade getGrade() {
        return grade;
    }

    // Setter to record the grade
    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Enrollment [student=" + student.getFullName() + ", course=" + course.getTitle() + ", grade=" + grade + "]";
    }
}