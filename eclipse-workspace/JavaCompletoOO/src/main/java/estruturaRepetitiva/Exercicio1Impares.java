package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio1Impares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if(numero >= 1 && numero <= 1000) {
            for(int i = 1; i <= numero; i++) {
                if(i % 2 != 0) {
                    System.out.println(i);
                }
            }
        }
    }
}
