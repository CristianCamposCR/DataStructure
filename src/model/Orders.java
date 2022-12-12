package model;

public class Orders {
    private User user;

    public Orders() {
    }

    public Orders(User user) {
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "user=" + user +
                '}';
    }
}
