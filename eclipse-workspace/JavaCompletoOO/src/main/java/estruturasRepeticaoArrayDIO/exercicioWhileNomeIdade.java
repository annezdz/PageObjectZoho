package estruturasRepeticaoArrayDIO;

import java.util.Objects;
import java.util.Scanner;

public class exercicioWhileNomeIdade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name;
        while(true) {
            System.out.print("Nome: ");
            name = scanner.next();
            if(name.equals("0")) {
                break;
            } else {
                System.out.print("Idade: ");
                int idade = scanner.nextInt();
                name = scanner.nextLine();
            }
        }
    }
}
