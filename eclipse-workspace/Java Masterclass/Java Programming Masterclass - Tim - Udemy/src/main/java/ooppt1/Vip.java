package ooppt1;

public class Vip {

    private String name;
    private double limit;
    private String email;

    public Vip() {
        this("Default name",1.00d,"default@defaul.com");
    }

    public Vip(String name, double limit) {
        this(name,limit,"default@defaut.com");
    }

    public Vip(String name, double limit, String email) {
        this.name = name;
        this.limit = limit;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public double getLimit() {
        return limit;
    }

    public String getEmail() {
        return email;
    }
}
