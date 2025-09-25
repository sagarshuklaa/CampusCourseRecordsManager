package edu.ccrm.domain;

public class Course {

    // These fields are private and final, making the Course object immutable once created.
    private final String code;
    private final String title;
    private final int credits;

    // The constructor is private, so a Course object can only be created by its Builder.
    private Course(Builder builder) {
        this.code = builder.code;
        this.title = builder.title;
        this.credits = builder.credits;
    }

    // This nested public static class is the Builder.
    public static class Builder {
        private String code;
        private String title;
        private int credits;

        // The Builder's constructor sets the required fields.
        public Builder(String code, String title) {
            this.code = code;
            this.title = title;
        }

        // These "with" methods are for optional fields and return the Builder itself.
        // This allows for method chaining, e.g., new Builder(...).withCredits(3).build().
        public Builder withCredits(int credits) {
            this.credits = credits;
            return this;
        }

        // The final build() method creates and returns the Course object.
        public Course build() {
            return new Course(this);
        }
    }

    // Public getters to access the immutable fields.
    public String getCode() {
        return code;
    }

    public String getTitle() {
        return title;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return "Course [code=" + code + ", title=" + title + ", credits=" + credits + "]";
    }
}