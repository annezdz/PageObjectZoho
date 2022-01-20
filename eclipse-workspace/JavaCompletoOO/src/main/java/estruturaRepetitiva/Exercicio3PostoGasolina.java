package estruturaRepetitiva;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Exercicio3PostoGasolina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Combustivel : 1 - Alcool 2 - Gasolina - 3 Diesel 4 Fim ");
        int opcao = scanner.nextInt();
        int totalGasolina = 0, totalDiesel = 0, totalAlcool = 0;

        while(opcao != 4) {
            switch (opcao) {
                case 1 : {
                    totalAlcool++;
                    break;
                }
                case 2 : {
                    totalGasolina++;
                    break;
                }
                case 3 : {
                    totalDiesel++;
                    break;
                }
                case 4 : {
                    System.out.println("MUITO OBRIGADO");
                }
                default:
                    System.out.println("Opção invalida. Selecione 1, 2 , 3 ou 4 para finalizar.");
            }
            opcao = scanner.nextInt();
        }
        System.out.println("Alcool : " + totalAlcool);
        System.out.println("Gasolina : " + totalGasolina);
        System.out.println("Diesel : " + totalDiesel);
    }
}
