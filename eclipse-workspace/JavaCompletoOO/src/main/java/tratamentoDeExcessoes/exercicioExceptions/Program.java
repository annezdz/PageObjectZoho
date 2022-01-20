package tratamentoDeExcessoes.exercicioExceptions;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

            Locale.setDefault(Locale.US);
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter account data: ");
            System.out.print("Number : ");
            int number = scanner.nextInt();
            System.out.print("Holder : ");
            scanner.nextLine();
            String holder = scanner.nextLine();
            System.out.print("Initial balance: ");
            double inicialBalance = scanner.nextDouble();
            System.out.print("Withdraw limit: ");
            double withdrawLimit = scanner.nextDouble();
            Account account = new Account(number, holder, inicialBalance, withdrawLimit);

            System.out.println();
            System.out.print("Enter amount for withdraw : ");
            double valueWithdraw = scanner.nextDouble();

            try {
            account.withDraw(valueWithdraw);
            System.out.println("New Balance: ");
            System.out.println(account.getBalance());

            } catch (BusinessException ex) {
                System.out.println(ex.getMessage());
            }
            scanner.close();
    }
}
