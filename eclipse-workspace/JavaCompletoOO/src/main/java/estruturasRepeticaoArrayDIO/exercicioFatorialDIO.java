package estruturasRepeticaoArrayDIO;

import java.util.Scanner;

public class exercicioFatorialDIO {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero para gerar o fatorial: ");
        int number = scanner.nextInt();
        int fatorial = 1;
        for(int i = 1; i <= number; i++) {
            fatorial *= i;
            System.out.println(fatorial);
        }
    }
}
