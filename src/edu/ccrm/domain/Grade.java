package edu.ccrm.domain;

// This enum represents a fixed set of grade constants.
// It also has a field and a constructor to hold extra information (grade points).
public enum Grade {
    S(4.0), 
    A(3.7), 
    B(3.0), 
    C(2.7), 
    D(2.0), 
    F(0.0);

    // This private field holds the grade point for each grade.
    private final double gradePoint;

    // This is the constructor for the enum. It's called when each constant is created.
    Grade(double gradePoint) {
        this.gradePoint = gradePoint;
    }

    // This getter method provides public access to the private gradePoint field.
    public double getGradePoint() {
        return gradePoint;
    }
}
