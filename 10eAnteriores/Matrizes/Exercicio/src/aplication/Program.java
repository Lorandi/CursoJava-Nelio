package aplication;

// Fazer um programa para ler dois números inteiros L e C, e depois ler uma matriz L linhas
// por C colounas contendo números inteiros, podendo haver repetições. Em seguida, ler
//um número inteiro X que pertence à matriz. Para cada ocorrência de X, mostrar os valores
// à esquerda, acima, à direita e abaixo de X, quando hover.


import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print(" Coloque o número de linhas: ");
        int L = scan.nextInt();

        System.out.print(" Coloque o número de colunas: ");
        int C = scan.nextInt();

        int[][] mat = new int[L][C];

        System.out.println("Digite os números da matriz: ");

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                mat[i][j] = scan.nextInt();
            }
        }


        System.out.print("Digite o número a ser procurado: ");
        int x = scan.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {

                if (mat[i][j] == x) {
                    System.out.println("Position " + i + "," + j + ":");
                    if (j > 0) {
                        System.out.println("Left: " + mat[i][j - 1]);
                    }
                    if (i > 0) {
                        System.out.println("Up: " + mat[i - 1][j]);
                    }
                    if (j < mat[i].length - 1) {
                        System.out.println("Right: " + mat[i][j + 1]);
                    }
                    if (i < mat.length - 1) {
                        System.out.println("Down: " + mat[i + 1][j]);
                    }
                    System.out.println();
                }
            }

        }
    }

}
