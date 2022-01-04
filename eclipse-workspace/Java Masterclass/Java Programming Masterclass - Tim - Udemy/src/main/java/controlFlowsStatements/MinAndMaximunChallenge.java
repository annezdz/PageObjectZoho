package controlFlowsStatements;

import java.util.Scanner;

public class MinAndMaximunChallenge {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minNumber = 999999999;
        int maxNumber = 0;
        do {
            System.out.println("Enter number : ");
            boolean isInt = scanner.hasNextInt();
            if(isInt){
                int number = scanner.nextInt();
                if(number > maxNumber){
                    maxNumber = number;
                }
                if(number < minNumber){
                    minNumber = number;
                }
            } else {
                break;
            }
            scanner.nextLine();
        } while (true);
        if(minNumber == 999999999){
            System.out.println("Min Number 0 " );
            System.out.println("Max Number " + maxNumber);

        }else {
            System.out.println("Min Number " + minNumber);
            System.out.println("Max Number " + maxNumber);
        }
    }
}
