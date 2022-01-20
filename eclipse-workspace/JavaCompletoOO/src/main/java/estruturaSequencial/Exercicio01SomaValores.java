package estruturaSequencial;

import java.util.Scanner;

public class Exercicio01SomaValores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe numero 1: ");
        int numero1 = scanner.nextInt();

        System.out.println("Informe numero 2: ");
        int numero2 = scanner.nextInt();

        int soma = numero1 + numero2;

        System.out.println("SOMA = " + soma);

    }
}
