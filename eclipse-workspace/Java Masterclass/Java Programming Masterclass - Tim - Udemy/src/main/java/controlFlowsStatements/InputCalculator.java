package controlFlowsStatements;

import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {

        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avg = 0;
        int count = 0;
        while (true){
            System.out.println("Input some else: ");
            boolean hasAnInt = scanner.hasNextInt();
            if(hasAnInt){
                count++;
                int number = scanner.nextInt();
                sum += number;
                avg =  Math.round(sum / count);
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
