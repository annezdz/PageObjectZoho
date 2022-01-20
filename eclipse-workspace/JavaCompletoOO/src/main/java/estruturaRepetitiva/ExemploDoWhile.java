package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ExemploDoWhile {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        char resp ;
        do {
            System.out.println("Digite a temperatura em Celsius:");
            double c = scanner.nextDouble();
            double f = 9.0 * c / 5.0 + 32.0;
            System.out.printf("Equivalente em Fahrenheit : %.1f%n",f);
            System.out.println("Deseja repetir ?(s/n)");
            resp = scanner.next().charAt(0);
        } while (resp != 'n');


    }
}
