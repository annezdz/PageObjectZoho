package exercicioSet;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {

    private Integer code;

    private List<Course> courses = new ArrayList<>();

    public User(Integer code) {
        this.code = code;
    }

    public void addCourse(Course newCourse) {

        courses.add(newCourse);
    }

    public void removeCourse(Course newCourse) {

        courses.remove(newCourse);
    }

    public Integer getCode() {
        return code;
    }

    public List<Course> getCourses() {
        return courses;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(code, user.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
