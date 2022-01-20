package estruturaCondicional;

import java.util.Scanner;

public class Exercicio1NumeroNegativo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        if(numero < 0) {
            System.out.println("NEGATIVO");
        } else {
            System.out.println("NÃO NEGATIVO");
        }
    }
}
