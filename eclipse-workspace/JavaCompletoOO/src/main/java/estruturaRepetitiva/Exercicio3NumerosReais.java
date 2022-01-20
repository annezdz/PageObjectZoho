package estruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio3NumerosReais {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        double numero1, numero2,numero3, media;

        for(int i = 0; i < numero; i++) {
            numero1 = scanner.nextDouble();
            numero2 = scanner.nextDouble();
            numero3 = scanner.nextDouble();
            media = (numero1 * 0.2) + (numero2 * 0.3) + (numero3 * 0.5);
            System.out.printf("%.1f%n",media);
        }

    }
}
