package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio6Divisores {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        for(int i = 1; i <= numero; i++) {
            if(numero %  i == 0) {
                System.out.println(i);
            }
        }
    }
}
