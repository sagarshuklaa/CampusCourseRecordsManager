package edu.ccrm.service;

import edu.ccrm.domain.Course;
import edu.ccrm.domain.Instructor;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// This class handles all business logic related to courses.
public class CourseService {

    // This list will store all the Course objects.
    private List<Course> courses = new ArrayList<>();

    // Adds a new course to the system.
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Course added: " + course.getTitle());
    }

    // Lists all courses in the system.
    public List<Course> listAllCourses() {
        return courses;
    }

    // Searches for courses by a specific instructor using the Stream API.
    public List<Course> searchByInstructor(Instructor instructor) {
        return courses.stream()
                      .filter(course -> course.getInstructor().equals(instructor))
                      .collect(Collectors.toList());
    }

    // This method will be used to demonstrate searching by department and semester.
    // It's a great example of using multiple filters on a stream.
    // public List<Course> searchAndFilter(String department, String semester) { ... }
}