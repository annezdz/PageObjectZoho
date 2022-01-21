package estruturasRepeticaoArrayDIO;

import java.util.Scanner;

public class exercicioConsoantes {

    public static void main(String[] args) {

        /**
         * Consoantes: Faça um Programa que leia um vetor de 6 caracteres, e diga quantas
         * consoantes foram lidas. Imprima as consoantes.
         *
         * */

        Scanner scanner = new Scanner(System.in);

        char [] vetor = new char[6];
        int i = 0;
        while(i < vetor.length) {
            vetor[i] = scanner.next().charAt(0);
            i++;
        }
        int countConsoantes = 0;
        for (char c : vetor) {
            if (!(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')) {
                countConsoantes++;
                System.out.print(c + " - ");
            }
        }
        System.out.println("Total consoantes : " + countConsoantes);
    }
}
