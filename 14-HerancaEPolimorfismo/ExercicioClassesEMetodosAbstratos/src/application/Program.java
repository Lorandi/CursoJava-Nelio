package application;

import entities.PessoaFisica;
import entities.PessoaJuridica;
import entities.Pessoas;
import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Pessoas> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.print("Individual or company (i/c)? ");
            char c = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();


            if (c == 'i') {
                System.out.print("Health expendutures: ");
                double gastosSaude = sc.nextDouble();

                Pessoas pessoa = new PessoaFisica(name, anualIncome, gastosSaude);

                list.add(pessoa);

            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                Pessoas pessoa = new PessoaJuridica(name, anualIncome, numberOfEmployees);

                list.add(pessoa);
            }
        }

        System.out.println();

        double totalTaxes = 0;

        System.out.println("TAXES PAID");
        for (Pessoas p : list) {
            totalTaxes += p.calculaImposto();
            System.out.println(p.getName() + " $ " + String.format("%.2f", p.calculaImposto()));
        }

        System.out.println();

        System.out.println("TOTAL TAX PAID: " + String.format("%.2f", totalTaxes));

        sc.close();

    }
}
