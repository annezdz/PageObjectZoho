package topicosBasicosJava;

import java.util.Scanner;

public class ExemploFuncoes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int higher = max(a,b,c);
        showResult(higher);



        scanner.close();
    }
    public static int max(int a , int b , int c) {
        int res = 0;
        if(a > b && a > c) {
            res =  a;
        } else if(b > c) {
            res = b;
        } else {
            res = c;
        }
        return res;
    }

    public static void showResult(int value) {
        System.out.println("Higher = " + value);
    }
}
