package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {


        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String x;
        x = scanner.next();
        System.out.println("Você digitou : " + x);


        int y;
        y = scanner.nextInt();
        System.out.println("Você digitou : " + y);

        double z;
        z = scanner.nextDouble();
        System.out.println("Você digitou : " + z);

        char s;
        s = scanner.next().charAt(0);
        System.out.println("Você digitou : " + s);

        scanner.close();



    }
}
