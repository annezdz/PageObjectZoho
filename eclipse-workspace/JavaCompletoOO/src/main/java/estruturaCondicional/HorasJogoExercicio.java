package estruturaCondicional;

import java.util.Scanner;

public class HorasJogoExercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hora Inicial : ");
        int horaInicial = scanner.nextInt();
        System.out.println("Hora Final :");
        int horaFinal = scanner.nextInt();
        int duracao = 0;
        if(horaInicial == horaFinal) {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }
        else if(horaInicial < horaFinal) {
            duracao = horaFinal - horaInicial;
            if(duracao > 0 && duracao <= 24) {
                System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
            }
        } else if (horaInicial > horaFinal) {
            duracao = (24 - horaInicial) + horaFinal;
            if(duracao > 0 && duracao <= 24) {
                System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
            }
        }
        scanner.close();
    }
}
