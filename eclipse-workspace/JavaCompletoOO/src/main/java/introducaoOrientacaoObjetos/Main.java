package introducaoOrientacaoObjetos;

import introducaoOrientacaoObjetos.entities.Employee;
import introducaoOrientacaoObjetos.entities.Product;
import introducaoOrientacaoObjetos.entities.Rectangle;
import introducaoOrientacaoObjetos.entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter product data: ");
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Price: ");
        double price = scanner.nextDouble();

        Product product = new Product(name,price);
        System.out.println();
        System.out.println("Product data : " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = scanner.nextInt();
        product.addProducts(quantity);
        System.out.println();
        System.out.println("Updated : " + product);
//
//        System.out.println();
//        System.out.println("Enter the number of products to be removed in stock: ");
//        quantity = scanner.nextInt();
//        product.removeProducts(quantity);
//        System.out.println();
//        System.out.println("Updated : " + product);
//        Rectangle rectangle = new Rectangle();
//        System.out.println("Enter rectangle width and height: ");
//        rectangle.width = scanner.nextDouble();
//        rectangle.height = scanner.nextDouble();
//        System.out.println("AREA = " + rectangle.area());
//        System.out.println("PERIMETER = " + rectangle.perimeter());
//        System.out.println("DIAGONAL = " + rectangle.diagonal());
//
//        System.out.println(rectangle);
//        Employee employee = new Employee();
//        System.out.print("Name : ");
//        employee.name = scanner.nextLine();
//        System.out.print("Gross salary: ");
//        employee.grossSalary = scanner.nextDouble();
//        System.out.print("Tax : ");
//        employee.tax = scanner.nextDouble();
//
//        System.out.println(employee);
//        System.out.println();
//        System.out.println("Which percentage to increase salary? ");
//        double percentual = scanner.nextDouble();
//        employee.increaseSalary(percentual);
//        System.out.println();
//        System.out.println(employee);

//        Student student = new Student();
//        student.name = scanner.nextLine();
//        student.grade1 = scanner.nextDouble();
//        student.grade2 = scanner.nextDouble();
//        student.grade3 = scanner.nextDouble();
//        System.out.println(student);
//        student.result();
//        scanner.close();
    }
}
