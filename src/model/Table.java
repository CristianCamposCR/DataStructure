package model;

import ProyectLeFesitin.Lists.ProductQueue;

public class Table {
    private int id;
    private boolean available;
    private ProductQueue orders;


    public Table() {
        orders = new ProductQueue();
    }

    public Table(int id, boolean available) {
        this.id = id;
        this.available = available;
        this.orders = new ProductQueue();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public ProductQueue getOrders() {
        return orders;
    }

    public void setOrders(ProductQueue orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Table{" +
                "id=" + id +
                ", available=" + available +
                '}';
    }
}
