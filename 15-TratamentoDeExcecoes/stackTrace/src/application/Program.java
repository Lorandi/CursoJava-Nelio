package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        method1();

        System.out.println("End of program");

    }
    public static void method1(){
        System.out.println("*** Method1 START ***");
        method2();
        System.out.println("*** Method1 END ***");

    }

    public static void method2(){
        System.out.println("*** Method2 START ***");
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Digite os nomes: ");
            String[] vect = sc.nextLine().split(" ");
            System.out.print("Digite o index: ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            sc.nextLine();
            System.out.println("Invalid position");
            e.printStackTrace();
            sc.next();
        } catch (InputMismatchException e) {
            sc.nextLine();
            System.out.println("Input error");
            e.printStackTrace();
            sc.next();
        }
        sc.close();
        System.out.println("*** Method2 END ***");
    }
}

