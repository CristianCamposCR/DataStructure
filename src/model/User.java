package model;

public class User {
    private String payment;
    private boolean membership;

    public User() {
    }

    public User(String payment, boolean membership) {
        this.payment = payment;
        this.membership = membership;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public boolean isMembership() {
        return membership;
    }

    public void setMembership(boolean membership) {
        this.membership = membership;
    }
}
