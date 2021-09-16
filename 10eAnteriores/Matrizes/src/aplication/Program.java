package aplication;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Type the number of line and coluns: ");
        int n = scan.nextInt();


        int[][] mat = new int[n][n];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scan.nextInt();
            }
        }

        System.out.print("Main diagonal: ");
        for (int i = 0; i < mat.length ; i++) {
            System.out.print(mat[i][i] + " ");
        }
        System.out.println();

        int negatives =0;


        for (int i = 0; i <mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] < 0) {
                    negatives++;
                }
            }
        }
        System.out.print("Negative numbers: " + negatives);




        scan.close();
    }
}
