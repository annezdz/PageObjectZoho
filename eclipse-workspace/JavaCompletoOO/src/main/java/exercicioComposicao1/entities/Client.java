package exercicioComposicao1.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Client {

    private String name;
    private String email;
    private Date birthDate;

    private List<Order> listOrders = new ArrayList<>();

    public Client() {}

    public Client(String name, String email, Date birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public void addOrder(Order order) {
        listOrders.add(order);
    }

    public void removeOrder(Order order) {
        listOrders.remove(order);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
