package estruturaRepetitiva;

import java.util.Scanner;

public class Exercicio2PlanoCartesiano {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        while (x != 0 && y != 0) {
            if(x < 0 && y < 0) {
                System.out.println("Q3");
            } else if(x < 0) {
                System.out.println("Q2");
            } else if(y < 0) {
                System.out.println("Q4");
            } else {
                System.out.println("Q1");
            }
            x = scanner.nextInt();
            y = scanner.nextInt();
        }
        scanner.close();
    }
}
