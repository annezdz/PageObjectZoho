package estruturasRepeticaoArrayDIO;

import java.util.Locale;
import java.util.Scanner;

public class exercicioWhileNotaDIO {
    public static void main(String[] args) {
        /**
         * Faça um programa que peça uma nota, entre zero e dez.
         * Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o
         * usuário informe um valor válido.
         * */

        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nota: ");
        double nota = scanner.nextDouble();
//        while (true) {
//            System.out.println("Nota : ");
//            nota = scanner.nextDouble();
//            if(nota >= 0.0 && nota <= 10) {
//                continue;
//            } else {
//                System.out.println("Valor inválido");
//                break;
//            }
//        }

        while(nota < 0.0 || nota > 10.0) {
                System.out.println("Valor inválido.");
                nota = scanner.nextDouble();
            }
        }
    }

