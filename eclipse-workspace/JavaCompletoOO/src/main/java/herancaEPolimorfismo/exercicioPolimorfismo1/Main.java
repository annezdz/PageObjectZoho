package herancaEPolimorfismo.exercicioPolimorfismo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<Product> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of products: ");
        int numberProducts = scanner.nextInt();

        for(int i = 1; i <= numberProducts;i++) {
            System.out.println("Product #" + i + " data: ");
            System.out.print("Common, used or imported (c/u/i)? ");
            char resp = scanner.next().charAt(0);
            scanner.nextLine();
            System.out.print("Name : ");
            String name = scanner.nextLine();
            System.out.print("Price: ");
            double price = scanner.nextDouble();
            if(resp == 'i') {
                System.out.print("Custom fee: ");
                double customFee = scanner.nextDouble();
                list.add(new ImportedProduct(name,price,customFee));
            } else if (resp == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(scanner.next());
                list.add(new UsedProduct(name,price,manufactureDate));
            } else {
                list.add(new Product(name,price));
            }
        }
        System.out.println();
        System.out.println("PRICE TAGS: ");
        for(Product product : list) {
            System.out.println(product.priceTag());
        }
        scanner.close();
    }
}
