package edu.ccrm.domain;

// This is an abstract class, which means it cannot be instantiated directly.
// Its purpose is to be a base class for other classes.
public abstract class Person {

    // These are private fields. They can only be accessed from within this class.
    // This is a key part of Encapsulation.
    private String id;
    private String fullName;
    private String email;

    // This is the constructor. It's called when you create a new Person object.
    // It initializes the private fields.
    public Person(String id, String fullName, String email) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
    }

    // These are public getter methods. They provide controlled access to the private fields.
    // This is also part of Encapsulation.
    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public String getEmail() {
        return email;
    }

    // This is an abstract method. It has no body.
    // Any class that extends 'Person' MUST provide its own implementation of this method.
    public abstract String getDetails();
}




