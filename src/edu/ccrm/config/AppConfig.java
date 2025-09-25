package edu.ccrm.config;

// This class demonstrates the Singleton design pattern.
// It ensures that only a single instance of this class can be created.
public class AppConfig {

    // This is the single instance of the class. It's private and static.
    private static AppConfig instance = new AppConfig();
    
    // The constructor is private. This prevents any other class from creating an instance of AppConfig directly.
    private AppConfig() {
        // You can add code here to load configuration settings, such as file paths or database connections.
    }

    // This public static method provides global access to the single instance.
    // All other classes must use this method to get a reference to the AppConfig object.
    public static AppConfig getInstance() {
        return instance;
    }
}