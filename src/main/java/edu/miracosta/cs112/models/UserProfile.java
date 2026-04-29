package edu.miracosta.cs112.models;

/**
 * Represents a user profile for the MCC Tracker app
 * A UserProfile stores basic user information and connects the user to a DietTracker object
 */

public class UserProfile {
    // Instance variables
    private String name;
    private int age;
    private String goal;
    private DietTracker dietTracker;

    /**
     * Default constructor.
     * Creates a UserProfile with default values.
     */
    public UserProfile() {
        this("Unknown", 0, "No goal set", new DietTracker());
    }

    /**
     * Full constructor.
     * Creates a UserProfile using the given name, age, goal and DietTracker.
     */
    public UserProfile(String name, int age, String goal, DietTracker dietTracker) {
        this.setName(name);
        this.setAge(age);
        this.setGoal(goal);
        this.setDietTracker(dietTracker);
    }

    /**
     * Copy constructor.
     * Creates a new UserProfile using another UserProfile object's data.
     */
    public UserProfile(UserProfile original) {
        this(original.name, original.age, original.goal, original.dietTracker);
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGoal() {
        return goal;
    }

    public DietTracker getDietTracker() {
        return dietTracker;
    }

    // Setters with validation
    public boolean setName(String name) {
        if (name == null || name.isBlank()) {
            return false;
        }
        this.name = name;
        return true;
    }

    public boolean setAge(int age) {
        if (age < 0) {
            return false;
        }
        this.age = age;
        return true;
    }

    public boolean setGoal(String goal) {
        if (goal == null || goal.isBlank()) {
            return false;
        }
        this.goal = goal;
        return true;
    }

    public boolean setDietTracker(DietTracker dietTracker) {
        if (dietTracker == null) {
            return false;
        }
        this.dietTracker = dietTracker;
        return true;
    }

    /**
     * Checks whether this UserProfile has the same values as another object
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof UserProfile)) {
            return false;
        }

        UserProfile other = (UserProfile) obj;

        return this.age == other.age
                && this.name.equals(other.name)
                && this.goal.equals(other.goal)
                && this.dietTracker.equals(other.dietTracker);
    }

    /**
     * Returns a String representation of the UserProfile object
     */
    @Override
    public String toString() {
        return "UserProfile{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", goal='" + goal + '\'' +
                ", dietTracker=" + dietTracker +
                '}';
    }
}
