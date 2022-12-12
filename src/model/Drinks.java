package model;

public class Drinks extends Product {

    private int size;
    private String brand;
    private boolean alcoholic;


    public Drinks(String name, float price, String description, int size, String brand, boolean alcoholic) {
        super(name, price, description);
        this.size = size;
        this.brand = brand;
        this.alcoholic = alcoholic;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public boolean isAlcoholic() {
        return alcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        this.alcoholic = alcoholic;
    }

    @Override
    public String toString() {
        String text= "";
        String alcohol = alcoholic?"with alcohol": "without alcohol";
        text = "Name: " + getName()+ "\tsize:" + size + " price: " + getPrice()+ ", description: '" + this.getDescription() + " " + alcohol + "' brand: " + brand +  '.';
        return text;
    }

    @Override
    public String getType() {
        return "I'm drink";
    }
}
