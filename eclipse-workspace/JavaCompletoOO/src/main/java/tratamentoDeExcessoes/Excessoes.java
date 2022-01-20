package tratamentoDeExcessoes;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Excessoes {
    public static void main(String[] args) {

        //Vetor de Strings separados por espaço em branco

       method1();

        System.out.println("End of program");

    }
    public static void method1() {
        System.out.println("*** METHOD 1  START *** ");
        method2();
        System.out.println("*** METHOD 1  END *** ");

    }


    public static void method2() {
        System.out.println("*** METHOD 2  START *** ");
        Scanner scanner = new Scanner(System.in);
        try{
            String[] vect = scanner.nextLine().split(" ");
            int position = scanner.nextInt();
            System.out.println(vect[position]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
            scanner.next();
        } catch (InputMismatchException ex) {
            System.out.println("Input error");
        }
        scanner.close();
        System.out.println("*** METHOD 2 END *** ");

    }
}
