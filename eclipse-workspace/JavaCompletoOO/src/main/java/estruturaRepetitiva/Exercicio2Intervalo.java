package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio2Intervalo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor = scanner.nextInt();
        int in = 0;
        int out = 0;
        for(int i = 0; i < valor; i++) {
            int numero = scanner.nextInt();
            if(numero >= 10 && numero <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
