package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio4Divisor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = scanner.nextInt();
        int numero1, numero2;
        double resultado;
        for(int i = 0; i < contador; i++) {
            numero1 = scanner.nextInt();
            numero2 = scanner.nextInt();
            if(numero2 == 0) {
                System.out.println("divisão impossivel");
            } else {
                System.out.println(resultado = (double)numero1 / numero2);
            }
        }
    }
}
