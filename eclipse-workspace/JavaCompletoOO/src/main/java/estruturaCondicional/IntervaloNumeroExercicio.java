package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class IntervaloNumeroExercicio {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double numero = scanner.nextDouble();

        if (numero > 0 && numero < 101) {
            if (numero <= 25) {
                System.out.println("Intervalo[0,25]");
            } else if (numero <= 50) {
                System.out.println("Intervalo[25,50]");
            } else if (numero <= 75) {
                System.out.println("Intervalo[50,75]");
            } else if (numero <= 100) {
                System.out.println("Intervalo[75,100]");
            }
        } else {
            System.out.println("Fora do intervalo");
        }
    }
}

