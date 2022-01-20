package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class FuncionarioExercicio {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero do funcionario = ");
        int numeroFuncionario = scanner.nextInt();
        System.out.println("Horas trabalhadas = ");
        int horasTrabalhadas = scanner.nextInt();
        System.out.println("Valor da hora trabalhada = ");
        double valorHora = scanner.nextDouble();
        double salario = horasTrabalhadas * valorHora;
        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n",salario);
        scanner.close();
    }
}
