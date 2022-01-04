package controlFlowsStatements;

import java.util.Scanner;

public class ReadingNumbersTim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        while (true){
            int order = counter + 1;
            System.out.println("Enter number " + counter +  ": ");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int number = scanner.nextInt();
                counter ++;
                sum += number;
                if(counter == 10){
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("Sum = " + sum);
        scanner.close();
    }
}
