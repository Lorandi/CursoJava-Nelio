package Versao3;

import java.util.Locale;
import java.util.Scanner;

public class CalcEstatico {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter radius: ");
        double radius = sc.nextDouble();

        double c = CalculatorEstatico.circumference(radius);

        double v = CalculatorEstatico.volume(radius);

        System.out.printf("Circumference: %.2f%n", c);
        System.out.printf("Volume: %.2f%n", v);
        System.out.printf("PI value: %.2f%n", CalculatorEstatico.PI);
        sc.close();
    }
}
