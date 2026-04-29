package edu.miracosta.cs112.models;

public class UserProfile {
    private String name;
    private int age;
    private String goal;
    private DietTracker dietTracker;

    public UserProfile() {
        this("Unknown", 0, "No goal set", new DietTracker());
    }

    public UserProfile(String name, int age, String goal, DietTracker dietTracker) {
        this.setName(name);
        this.setAge(age);
        this.setGoal(goal);
        this.setDietTracker(dietTracker);
    }

    public UserProfile(UserProfile original) {
        this(original.name, original.age, original.goal, original.dietTracker);
    }

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
