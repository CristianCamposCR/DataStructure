package model;

public class Meal extends Product {
    private String name;
    private float price;

    public Meal(String name, float price, String description, String type) {
        super(name, price, description);
    }

    @Override
    public String getType() {
        return  "I'm a meal";
    }
}
