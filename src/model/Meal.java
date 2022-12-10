package model;

public class Meal extends Product {

    public Meal(String name, float price, String description) {
        super(name, price, description);
    }

    @Override
    public String getType() {
        return  "I'm a meal";
    }
}
