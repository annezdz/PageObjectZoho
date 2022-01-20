package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        int fatorial = 1;
        for(int i = numero; i > 1 ; i--) {
            fatorial += fatorial * (i - 1);
        }
        System.out.println(fatorial);
    }
}
