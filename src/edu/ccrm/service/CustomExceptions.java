package edu.ccrm.service;

// This is a checked exception. It must be handled by the caller.
// It is used when a student is already enrolled in a course.
public class DuplicateEnrollmentException extends Exception {
    public DuplicateEnrollmentException(String message) {
        super(message);
    }
}

// This is an unchecked exception. It does not need to be explicitly handled.
// It is used when a student tries to enroll in too many credits.
public class MaxCreditLimitExceededException extends RuntimeException {
    public MaxCreditLimitExceededException(String message) {
        super(message);
    }
}
