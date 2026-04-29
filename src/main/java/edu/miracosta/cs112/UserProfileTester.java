package edu.miracosta.cs112;

import edu.miracosta.cs112.models.UserProfile;
import edu.miracosta.cs112.models.DietTracker;

public class UserProfileTester {

    public static void main(String[] args) {

        // Test 1: Default constructor
        UserProfile user1 = new UserProfile();
        System.out.println("Default constructor: " + user1);

        // Test 2: Full constructor
        UserProfile user2 = new UserProfile("Hasan", 22, "Build muscle", new DietTracker());
        System.out.println("Full constructor: " + user2);

        // Test 3: Copy constructor
        UserProfile user3 = new UserProfile(user2);
        System.out.println("Copy constructor: " + user3);

        // Test 4: Setters
        user1.setName("Alex");
        user1.setAge(30);
        user1.setGoal("Lose weight");
        user1.setDietTracker(new DietTracker());
        System.out.println("After setters: " + user1);

        // Test 5: Getters
        System.out.println("Name: " + user2.getName());
        System.out.println("Age: " + user2.getAge());
        System.out.println("Goal: " + user2.getGoal());

        // Test 6: Equals
        System.out.println("user2 equals user3: " + user2.equals(user3));
        System.out.println("user1 equals user2: " + user1.equals(user2));
    }
}
