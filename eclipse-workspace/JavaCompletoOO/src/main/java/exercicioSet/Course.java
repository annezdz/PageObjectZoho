package exercicioSet;

public class Course {

    private String name;

    private User user;

    public Course(String name, User user) {
        this.name = name;
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public User getUser() {
        return user;
    }


}
