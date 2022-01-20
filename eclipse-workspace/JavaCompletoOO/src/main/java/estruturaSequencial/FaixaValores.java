package estruturaSequencial;

import java.util.Scanner;

public class FaixaValores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1,number2,number3,number4;
        number1 = scanner.nextInt();
        number2= scanner.nextInt();
        number3 = scanner.nextInt();
        number4 = scanner.nextInt();
        int diferenca = (number1 * number2) - (number3 * number4);
        System.out.println("DIFERENCA = " + diferenca);


    }
}
