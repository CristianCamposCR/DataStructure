package model;

public class Person {
    private String name;
    private String age;
    private String genre;
    private  String feeling;

    public Person(String name) {
        this.name = name;
        this.age = "";
        this.genre = "";
        this.feeling = "";
    }

    public Person(String name, String age, String genre, String feeling) {
        this.name = name;
        this.age = age;
        this.genre = genre;
        this.feeling = feeling;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getFeeling() {
        return feeling;
    }

    public void setFeeling(String feeling) {
        this.feeling = feeling;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", genre='" + genre + '\'' +
                ", feeling='" + feeling + '\'' +
                '}';
    }
}
