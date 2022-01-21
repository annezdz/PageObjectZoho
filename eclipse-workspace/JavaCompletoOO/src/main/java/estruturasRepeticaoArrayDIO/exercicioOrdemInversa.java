package estruturasRepeticaoArrayDIO;

import java.util.Scanner;

public class exercicioOrdemInversa {
    public static void main(String[] args) {
        /**
         * Ordem Inversa:
         * Faça um Programa que leia um vetor de 5 números inteiros e mostre-os na ordem inversa.
         *
         * */

        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        for(int i = 0; i < a.length;i++) {
            a[i] = scanner.nextInt();
        }

        for(int i = a.length -1; i >= 0; i--) {
            System.out.println(a[i]);
        }


    }
}
