package model;

public class Employ {
    private String rfc;
    private float salary;
    private String position;

    public Employ() {
    }

    public Employ(String rfc, float salary, String position) {
        this.rfc = rfc;
        this.salary = salary;
        this.position = position;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
