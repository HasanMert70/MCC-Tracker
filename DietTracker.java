public class DietTracker extends HealthTracker {

    // constant variables
    public static final String DEFAULT_FOOD_NAME = "Water";
    public static final int DEFAULT_CALORIES = 0;
    public static final double DEFAULT_PROTEIN = 0; // grams
    public static final boolean DEFAULT_IS_SINGLE_MEAL = false;
    public static final String DEFAULT_GOAL = "Stay hydrated";

    // instance variables
    private String foodName;
    private int calories;
    private double protein; // grams
    private boolean isSingleMeal; // this object represents a whole (single) meal [true] or a single item [false]
    private String goal;

    public DietTracker(double weight, int height,
            String foodName, int calories, double protein,
            boolean isSingleMeal, String goal) {
        // set inherited data
        super(weight, height);
        // set new data
        if (!this.setFoodName(foodName) || !this.setCalories(calories)
                || !this.setProtein(protein) || !this.setIsSingleMeal(isSingleMeal)
                || !this.setGoal(goal)) {
            System.out.println("ERROR: bad data given to full DietTracker constructor");
            System.exit(0);
        }

    }

    public DietTracker() {
        // set inherited + new data
        this(DEFAULT_WEIGHT, DEFAULT_HEIGHT, DEFAULT_FOOD_NAME, DEFAULT_CALORIES,
                DEFAULT_PROTEIN, DEFAULT_IS_SINGLE_MEAL, DEFAULT_GOAL);
    }

    public DietTracker(DietTracker original) {
        if (original != null) {
            // set all the data
            this.setWeight(original.getWeight());
            this.setHeight(original.getHeightInInches());
            this.setFoodName(original.foodName);
            this.setCalories(original.calories);
            this.setProtein(original.protein);
            this.setIsSingleMeal(original.isSingleMeal);
            this.setGoal(original.goal);
        } else {
            System.out.println("ERROR: null given to copy DietTracker constructor");
            System.exit(0);
        }
    }

    // SETTERS/MUTATORS
    public boolean setFoodName(String foodName) {
        if (foodName != null && foodName.length() > 0) {
            this.foodName = foodName;
            return true;
        } else {
            return false;
        }
    }

    public boolean setCalories(int calories) {
        if (calories >= 0) {
            this.calories = calories;
            return true;
        } else {
            return false;
        }
    }

    /**
     * Set protein (grams) to allowed values
     * 
     * @param protein number of grams of protein intake for food
     * @return valid data was set (or not)
     */
    public boolean setProtein(double protein) {
        if (protein >= 0) {
            this.protein = protein;
            return true;
        } else {
            return false;
        }
    }

    public boolean setIsSingleMeal(boolean isSingleMeal) {
        this.isSingleMeal = isSingleMeal;
        return true;
    }

    public void setToSingleMeal() {
        this.isSingleMeal = true;
    }

    public void setToSingleItem() {
        this.isSingleMeal = false;
    }

    public boolean setGoal(String goal) {
        if (goal != null && goal.length() > 0) {
            this.goal = goal;
            return true;
        } else {
            return false;
        }
    }

    // GETTERS/ACCESSORS
    public String getFoodName() {
        return this.foodName;
    }

    public int getCalories() {
        return this.calories;
    }

    public double getProtein() {
        return this.protein;
    }

    public boolean isSingleMeal() {
        return this.isSingleMeal;
    }

    public String getGoal() {
        return this.goal;
    }

    // OTHER REQUIRED METHODS

    @Override
    public String toString() {
        return super.toString() + ", food: " + this.foodName +
                " with " + this.calories + " calories, protein =" +
                this.protein + ", is single meal? " + this.isSingleMeal +
                " with goal of " + this.goal;
    }
}
