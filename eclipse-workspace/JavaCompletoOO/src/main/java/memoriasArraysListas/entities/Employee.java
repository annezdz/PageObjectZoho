package memoriasArraysListas.entities;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        setId(id);
        this.name = name;
        this.salary = salary;
    }

    public void increaseSalary(double percentage) {
        this.salary += (salary * (percentage/100));
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return  id +
                " , " + name  +
                " , " + String.format("%.2f",salary);
    }
}
