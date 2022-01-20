package estruturasRepeticaoArrayDIO;

import java.util.Scanner;

/**
 * : Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número
 * inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
 *
 * Tabuada de 5:
 * 5 X 1 = 5
 * 5 X 2 = 10
 * ...
 * 5 X 10 = 50
 *
 *
 * */

public class exercicioTabuada {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um numero para gerar a tabuada : ");
        int number = scanner.nextInt();

        System.out.println("Tabuada de " + number);
        for(int i = 0; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
}
