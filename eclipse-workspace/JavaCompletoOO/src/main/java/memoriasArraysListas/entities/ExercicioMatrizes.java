package memoriasArraysListas.entities;

import java.util.Scanner;

public class ExercicioMatrizes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int[][] mat = new int[m][n];

        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scanner.nextInt();
            }
        }
        System.out.println("---- ");
        System.out.println();
        int number = scanner.nextInt();
        for(int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if(mat[i][j] == number) {
                        System.out.println("Position :" + i + "," + j);
                        try {
                            System.out.println("Left :" + mat[i][j - 1]);
                            System.out.println("Right : " + mat[i][j + 1]);
                            System.out.println("Down : " + mat[i+1][j]);
                        } catch (Exception e) {
                            System.out.println(" ");
                            System.out.println("Up : " + mat[i-1][j]);
                        }
                }
            }
        }
    }
}
