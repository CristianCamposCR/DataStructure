package model;

public class MailBox {
    private int id;
    private String from;
    private String subject;
    private String body;

    public MailBox(int id, String from, String subject, String body) {
        this.id = id;
        this.from = from;
        this.subject = subject;
        this.body = body;
    }

    public MailBox() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "MailBox["+ id +']'+
                ": From='" + from + '\'' +  '\n'+
                "\tSubject='" + subject + '\'' +  '\n'+
                "\tBody='" + body + '\'';
    }
}
