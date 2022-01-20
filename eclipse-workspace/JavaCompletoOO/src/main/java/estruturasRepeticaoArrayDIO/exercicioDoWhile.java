package estruturasRepeticaoArrayDIO;

import java.util.Scanner;

public class exercicioDoWhile {
    public static void main(String[] args) {

        /**
         *
         * Maior e Média: Faça um programa que leia 5 números e informe o maior
         * número e a média desses números.
         *
         * */

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int sum = 0;
        int minValue = Integer.MIN_VALUE;
        do {
            System.out.print("Numero " + (count + 1) + ":");
            int number = scanner.nextInt();
            sum += number;
            if (number > minValue) {
                minValue = number;
            }
            count++;
        }
        while (count < 5);
        double media = sum / count;
        System.out.printf("Media : %.2f%n",media);
        System.out.println("Maior numero : " + minValue);
    }
}
