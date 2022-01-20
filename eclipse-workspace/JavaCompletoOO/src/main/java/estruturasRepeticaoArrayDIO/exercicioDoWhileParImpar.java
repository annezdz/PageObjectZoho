package estruturasRepeticaoArrayDIO;

import java.util.Scanner;

public class exercicioDoWhileParImpar {
    public static void main(String[] args) {

        /**
         *
         * Par e Ímpar: Faça um programa que peça N números inteiros.
         * Calcule e mostre a quantidade de números pares e a quantidade de números impares.
         *
         * */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um contador: ");
        int counter = scanner.nextInt();
        int counterPar = 0, counterImpar = 0;
        do {
            System.out.print("Numero : ");
            int number = scanner.nextInt();
            if(number % 2 == 0) {
                counterPar++;
            } else {
                counterImpar++;
            }
            counter --;
        }while (counter != 0);
        System.out.println("Quantity pars : " + counterPar);
        System.out.println("Quantity odd: " + counterImpar);
    }
}
