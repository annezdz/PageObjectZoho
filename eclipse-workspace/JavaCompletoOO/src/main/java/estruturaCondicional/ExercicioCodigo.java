package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioCodigo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um codigo :");
        int codigo = scanner.nextInt();
        System.out.print("Informe a quantidade: ");
        int quantidade = scanner.nextInt();
        double valorAPagar = 0.0;
        if(codigo == 1) {
            valorAPagar += quantidade * 4.00;
        } else if(codigo == 2) {
            valorAPagar += quantidade * 4.50;
        } else if(codigo == 3) {
            valorAPagar += quantidade * 5.00;
        } else if(codigo == 4) {
            valorAPagar += quantidade * 2.00;
        } else if(codigo == 5) {
            valorAPagar += quantidade * 1.50;
        } else {
            System.out.println("Opcão invalida");
        }
        System.out.printf("Total: R$ %.2f%n",valorAPagar);
        scanner.close();

    }
}
