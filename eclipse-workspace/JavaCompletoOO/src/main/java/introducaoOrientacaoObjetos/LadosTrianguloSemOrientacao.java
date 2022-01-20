package introducaoOrientacaoObjetos;

import java.util.Locale;
import java.util.Scanner;

public class LadosTrianguloSemOrientacao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Triangle x = new Triangle();
        Triangle y = new Triangle();

        System.out.println("Enter the measures of triangle x: ");
        x.a= scanner.nextDouble();
        x.b = scanner.nextDouble();
        x.c = scanner.nextDouble();

        System.out.println("Enter the measures of triangle y: ");
        y.a = scanner.nextDouble();
        y.b = scanner.nextDouble();
        y.c = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();
        System.out.printf("Triangle X area : %.4f%n", areaX);
        System.out.printf("Triangle Y area : %.4f%n", areaY);
        if(areaX > areaY) {
            System.out.println("Larger area is " + areaX);
        } else {
            System.out.println("Larger area is " + areaY);
        }
    }
}
