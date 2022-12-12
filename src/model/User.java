package model;

public class User extends Person {
    private String payment;
    private boolean membership;

    public User(String name) {
        super(name);
    }

    public User(String name, String payment, boolean membership) {
        super(name);
        this.payment = payment;
        this.membership = membership;
    }

    public User(String name, String age, String genre, String feeling, String payment, boolean membership) {
        super(name, age, genre, feeling);
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

    @Override
    public String toString() {
        return "User{" +
                "payment='" + payment + '\'' +
                ", membership=" + membership +
                '}';
    }
}
