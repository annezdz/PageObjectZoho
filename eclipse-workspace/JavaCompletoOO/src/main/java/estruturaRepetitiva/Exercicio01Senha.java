package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio01Senha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Senha : ");
        int senha = scanner.nextInt();

        while(senha != 2002) {
            System.out.println("Senha Invalida");
            System.out.print("Senha : ");
            senha = scanner.nextInt();
        }
        System.out.println("Acesso Permitido");
        scanner.close();
    }
}
