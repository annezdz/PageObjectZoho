package exercicioMetodosAbstratos1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Person> list = new ArrayList<>();
        System.out.print("Enter the numbers of tax payers : ");
        int counter = scanner.nextInt();

        for(int i = 1; i <= counter;i++) {
            System.out.println("Tax payer #" + i + ":");
            System.out.print("Individual or company (i/c)? ");
            char resp = scanner.next().charAt(0);
            System.out.print("Name: ");
            scanner.nextLine();
            String name = scanner.nextLine();
            System.out.print("Anual income: ");
            double income = scanner.nextDouble();
            if(resp == 'i') {
                System.out.print("Health expenditures: ");
                double health = scanner.nextDouble();
                list.add(new IndividualPerson(name,income,health));
            } else {
                System.out.print("Number of employees: ");
                int employees = scanner.nextInt();
                list.add(new CompanyPerson(name,income,employees));
            }
        }
        double totalTaxes = 0.0;
        for(Person person : list) {
            totalTaxes += person.calculateTax();
        }
        System.out.println();
        System.out.println("TAXES PAID: ");
        for(Person person : list) {
            System.out.print(person);
        }
        System.out.print("TOTAL TAXES : $ " + totalTaxes);

    }
}
