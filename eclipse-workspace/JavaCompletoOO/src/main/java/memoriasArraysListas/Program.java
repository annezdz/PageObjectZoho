package memoriasArraysListas;

import memoriasArraysListas.entities.Aluguel;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Aluguel[] vectAluguel = new Aluguel[10];
        System.out.println("Numero de estudantes : ");
        int n = scanner.nextInt();
        if(n <= 10) {
            for(int i = 0; i < n; i++) {
                scanner.nextLine();
                System.out.print("Name: ");
                String name = scanner.nextLine();
                System.out.print("Email: ");
                String email = scanner.nextLine();
                System.out.print("Room: ");
                int room = scanner.nextInt();
                vectAluguel[i] = new Aluguel(name,email,room);
            }
            
            System.out.println("Busy rooms: ");
            for(int i = 0; i < n; i++) {
                System.out.println(vectAluguel[i].getRoom() + ":"
                        + vectAluguel[i].getName()
                        + ","
                        + vectAluguel[i].getEmail());
            }
        } else {
            System.out.println("Limite excedido.");
        }

        scanner.close();
    }
}
