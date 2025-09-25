package edu.ccrm.util;

// This utility class provides methods for validating data.
public class Validator {
    
    // A simple method to check for a basic email format.
    public static boolean isValidEmail(String email) {
        // This is a basic check. For a real application, you would use a more robust regex pattern.
        return email != null && email.contains("@") && email.contains(".");
    }
}
