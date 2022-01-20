package exercicioComposicao1.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> itens = new ArrayList<>();


    public Order() {}

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        itens.add(item);
    }

    public void removeItem(OrderItem item) {
        itens.remove(item);
    }

    public double total() {
        double sum = 0.0;
        for(OrderItem item : itens) {
            sum += item.subTotal();
        }
        return sum;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public List<OrderItem> getItens() {
        return itens;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: " );
        sb.append(sdf.format(moment) +"\n");
        sb.append("Order status: " + status+ "\n");
        sb.append("Client: " + client.getName() + " " + client.getBirthDate() + " - " + client.getEmail() + "\n");
        sb.append("Order items: " + "\n");
        for(OrderItem item : itens) {
            sb.append(item + "\n");
        }
        sb.append("Total price: $" + total());
        return sb.toString();
    }
}
/// public String toString() {
//        StringBuilder sb = new StringBuilder();
//        sb.append(title + "\n");
//        sb.append(likes);
//        sb.append(" Likes - ");
//        sb.append(sdf.format(moment) + "\n");
//        sb.append(content + "\n");
//        sb.append("Comments:\n");
//        for (Comment c : comments) {
//        sb.append(c.getText() + "\n");
//        }
//        return sb.toString();
//        }