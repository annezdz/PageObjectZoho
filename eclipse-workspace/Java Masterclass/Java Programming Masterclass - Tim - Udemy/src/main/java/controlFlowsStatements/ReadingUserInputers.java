package controlFlowsStatements;

import java.util.Scanner;

public class ReadingUserInputers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your year of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if(hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name : ");
            String name = scanner.nextLine();
            int age = 2021 - yearOfBirth;

            if(age >= 0 && age <= 130) {
                System.out.println("Your name is " + name + " and your are " + age + " years old");
            } else {
                System.out.println("Invalid value for age.");
            }
        } else {
            System.out.println("Unable to parse your birth.");
        }


        scanner.close();
    }
}
