package exercicioComposicao1.entities;

import jdk.swing.interop.SwingInterOpUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ") ;
        Date birthDate = sdf.parse(scanner.next());
        Client client = new Client(name,email,birthDate);

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(scanner.next());

        Order order = new Order(new Date(),status,client);
        System.out.print("How many items to this order ? ");
        int itens = scanner.nextInt();
        for(int i = 1; i <= itens; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.print("Product name: ");
            scanner.nextLine();
            String productName = scanner.nextLine();
            System.out.print("Product Price: ");
            double productPrice = scanner.nextDouble();

            Product product = new Product(productName,productPrice);

            System.out.print("Quantity : ");
            int quantityProduct = scanner.nextInt();
            OrderItem orderItem = new OrderItem(quantityProduct,productPrice,product);
            order.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY:");
        System.out.println(order);
        scanner.close();
    }
}
