package model;

public class Meal extends Product {


    private String complements;
    public Meal(String name, float price, String description,String complements) {
        super(name, price, description);
        this.complements = complements;
    }

    public String getComplements() {
        return complements;
    }

    public void setComplements(String complements) {
        this.complements = complements;
    }

    @Override
    public String toString() {
        String text ="";
        text = "Name: " + getName()+ "\tprice: " + getPrice() + "\tDescription: " + getDescription()
                + "\tComplements: " + complements;
        return text;
    }

    @Override
    public String getType() {
        return  "I'm a meal";
    }
}
