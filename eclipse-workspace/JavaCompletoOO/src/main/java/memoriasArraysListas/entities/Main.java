package memoriasArraysListas.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        List<Employee> list = new ArrayList<>();

        System.out.print("How many employees will be registered? ");
        int n = scanner.nextInt();


        for(int i = 0 ; i < n; i++) {
            System.out.println();
            System.out.println("Employee #" + (i + 1) +": ");
            System.out.print("Id: ");
            int id = scanner.nextInt();
            while (hasId(list, id)) {

                System.out.println("Id already taken. Try again.");
                System.out.print("Id:");
                id = scanner.nextInt();
            }
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Salary: ");
            double salary = scanner.nextDouble();
            list.add(new Employee(id,name,salary));
        }
        System.out.println();
        System.out.print("Enter the employee id that will hav salary increase : ");
        int id = scanner.nextInt();
        Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        if(emp == null) {
            System.out.println("This id does not exists!");
        } else {
            System.out.print("Enter the percentage: ");
            double percentage = scanner.nextDouble();
            emp.increaseSalary(percentage);
        }

        System.out.println("List of employees :");
        for(Employee obj : list) {
            System.out.println(obj);
        }
        scanner.close();
    }

    public static boolean hasId(List<Employee> list, int id) {
        Employee employee = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return employee != null;
    }
}
