package memoriasArraysListas;

import java.util.Scanner;

public class ExemploMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] mat = new int[n][n];

        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Main Diagonal");
        for(int i = 0; i < mat.length; i++) {
            for(int j = 0; j < n; j++) {
                if(i == j){
                    System.out.print(mat[i][j] + " ");
                }
            }
        }
        // ou

//        for(int i = 0; i < n; i++) {
//            System.out.print(mat[i][i] + " ");
//        }
        System.out.println();
        int negativeNumbers = 0;
        System.out.print("Negative numbers : ");
        for(int i=0; i< mat.length;i++) {
            for(int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] < 0) {
                    negativeNumbers++;
                }
            }
        }
        System.out.println(negativeNumbers);



    }
}
