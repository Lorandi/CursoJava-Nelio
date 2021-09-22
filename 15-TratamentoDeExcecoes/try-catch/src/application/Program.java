package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean teste = true;

        while(teste){
            try {
                System.out.print("Digite os nomes: ");
                String[] vect = sc.nextLine().split(" ");
                System.out.print("Digite o index: ");
                int position = sc.nextInt();
                System.out.println(vect[position]);
                teste = false;
            }
            catch (ArrayIndexOutOfBoundsException e){
                sc.nextLine();
                System.out.println("Invalid position");
            }
            catch (InputMismatchException e){
                sc.nextLine();
                System.out.println("Input error");
            }
        }



        System.out.println("End of program");

        sc.close();
    }
}
