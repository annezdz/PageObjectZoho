package herancaEPolimorfismo.metodosAbstratos;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Shape> lists = new ArrayList<>();
        System.out.print("Enter the number of shapes : ");
        int n = scanner.nextInt();

        for(int i = 1; i <= n; i++) {
            System.out.print("Shape #" + i + " data: ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char resp = scanner.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED) : ");
            Color color = Color.valueOf(scanner.next());
            if(resp=='r') {
                System.out.print("Width: ");
                double width = scanner.nextDouble();
                System.out.print("Height: ");
                double height = scanner.nextDouble();
                lists.add(new Rectangle(color,width,height));
            } else {
                System.out.print("Radius: ");
                double radius = scanner.nextDouble();
                lists.add(new Circle(color,radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for(Shape shape : lists) {
            System.out.println(String.format("%.2f%n",shape.area()));
        }

        scanner.close();
    }
}
