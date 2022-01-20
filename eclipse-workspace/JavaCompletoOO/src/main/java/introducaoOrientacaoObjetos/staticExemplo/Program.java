package introducaoOrientacaoObjetos.staticExemplo;

import introducaoOrientacaoObjetos.entities.ContaBancaria;

import java.util.Locale;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Enter radius : ");
//        double radius = scanner.nextDouble();
//
//        double circunferencia = Calculator.circunference(radius);
//
//        double volume = Calculator.volume(radius);
//        System.out.printf("Circunference : %.2f%n" , circunferencia);
//        System.out.printf("Volume : %.2f%n" , volume);
//        System.out.printf("PI value : %.2f%n" , Calculator.PI);
//        System.out.println("What is the dollar price? ");
//        double price = scanner.nextDouble();
//        System.out.println("How many dollars will be bought?");
//        double amount = scanner.nextDouble();
//        System.out.println("Amount to be paid in reais = " + CurrencyConverter.converter(price,amount));
        ContaBancaria contaBancaria;
        System.out.print("Enter account number : ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter account holder : ");
        scanner.nextLine();
        String name = scanner.nextLine();
        System.out.print("Is there an initial deposit? ");
        char response = scanner.next().charAt(0);
        double valueDeposit = 0.0;
        if(response == 'y') {
            System.out.print("Enter initial deposit value : ");
             valueDeposit = scanner.nextDouble();
            contaBancaria = new ContaBancaria(name,accountNumber,valueDeposit);
        } else {
            contaBancaria = new ContaBancaria(name,accountNumber);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(contaBancaria);
        System.out.println();
        System.out.println("Enter a deposit value :");
        double value = scanner.nextDouble();
        contaBancaria.deposit(value);
        System.out.println("Updated account data :");
        System.out.println(contaBancaria.getBalance());
        System.out.println();
        System.out.println("Enter a withdraw value : ");
        value = scanner.nextDouble();
        contaBancaria.withdraw(value);
        System.out.println("Updated account data :");
        System.out.println(contaBancaria.getBalance());
        System.out.println();

    }


}
