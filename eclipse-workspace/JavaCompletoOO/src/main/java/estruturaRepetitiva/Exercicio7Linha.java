package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio7Linha {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();
        for(int i = 1; i <= numero; i++) {
            System.out.println(i + " " + (int)(Math.pow(i,2)) + " " + (int)(Math.pow(i,3)));
        }
    }
}
