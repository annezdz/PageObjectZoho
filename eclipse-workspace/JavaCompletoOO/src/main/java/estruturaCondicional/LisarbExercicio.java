package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class LisarbExercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Salario : ");
        double salario = scanner.nextDouble();
        double impostosAPagar = 0;
        if(salario > 0) {
            if(salario <= 2000.00) {
                System.out.println("Isento");
            } else if (salario <= 3000.00) {
                impostosAPagar += (salario - 2000) * 0.08;
            } else if(salario <= 4500.00) {
                salario -= 2000;
                impostosAPagar +=  (999.99 * 0.08) + ((salario % 999.99) * 0.18);
            } else {
                salario -= 2000;
                impostosAPagar += (999.99 * 0.08) + (1499.99 * 0.18) + ((salario % 2500.00) * 0.28);
            }
        }

        System.out.printf("R$ %.2f%n",impostosAPagar);
    }
}
