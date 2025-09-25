package edu.ccrm.service;

import edu.ccrm.domain.Student;
import java.util.ArrayList;
import java.util.List;

// This class handles all business logic related to students.
public class StudentService {

    // This list will store all the Student objects.
    private List<Student> students = new ArrayList<>();

    // Adds a new student to the system.
    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added: " + student.getFullName());
    }

    // Lists all students in the system.
    public List<Student> listAllStudents() {
        return students;
    }
}