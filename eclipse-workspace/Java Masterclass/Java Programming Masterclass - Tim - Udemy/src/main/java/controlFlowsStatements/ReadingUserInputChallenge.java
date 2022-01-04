package controlFlowsStatements;

import java.io.BufferedReader;
import java.util.Scanner;

public class ReadingUserInputChallenge {
    public static void main(String[] args) {
        int count = 1;
        int sumNumbers = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number " + count +  ": ");
        boolean hasNext = scanner.hasNextInt();
        while(count <= 10){
            if(hasNext){
                sumNumbers += scanner.nextInt();
                count++;
                System.out.println("Enter number " + count +  " :");
            }
            else {
                System.out.println("Invalid number");
                break;
            }
            scanner.nextLine();
        }
        if(sumNumbers > 0) {
            System.out.println("Total is : " + sumNumbers);
        }
        scanner.close();
    }
}
