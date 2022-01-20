package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ValorAPagarExercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.print("Informe um código: ");
        int codigo1 = sc.nextInt();
        System.out.print("Numero de pecas: ");
        int numeroPecas1 = sc.nextInt();
        System.out.print("Valor unitario/peça: ");
        double valorPeca1 = sc.nextDouble();
        System.out.print("Informe um código: ");
        int codigo2 = sc.nextInt();
        System.out.print("Numero de pecas: ");
        int numeroPecas2 = sc.nextInt();
        System.out.print("Valor unitario/peça: ");
        double valorPeca2 = sc.nextDouble();
        double valorAPagar = (numeroPecas1 * valorPeca1) + (numeroPecas2 * valorPeca2);
        System.out.printf("VALOR A PAGAR : R$ %.2f%n",valorAPagar);
        sc.close();
    }
}
