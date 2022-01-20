package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioValorCirculo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o valor do raio de um círculo: ");
        double raio = scanner.nextDouble();
        double area = Math.PI * Math.pow(raio,2);
        System.out.printf("A=%.4f%n",area);
    }
}
