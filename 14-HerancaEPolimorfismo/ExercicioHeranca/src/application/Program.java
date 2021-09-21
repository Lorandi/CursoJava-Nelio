package application;

import entities.Employee;
import entities.OutsorceEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the numb er of employees: ");
        int employees = sc.nextInt();

        for(int i = 0;  i < employees; i++ ){
            System.out.println("Employee #" + (i+1) + " data");
            System.out.print("Outsourced (y/n)? ");
            char outserced = sc.next().charAt(0);

            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Hours: ");
            int hours =  sc.nextInt();

            System.out.print("Value per houra: ");
            double valuePerHour = sc.nextDouble();

            if (outserced == 'y') {
                System.out.print("Adicional charge: ");
                double adicionalCharge = sc.nextDouble();
                list.add(new OutsorceEmployee(name, hours,  valuePerHour,adicionalCharge));
            } else{
                list.add(new Employee(name, hours,  valuePerHour));
            }
        }

        System.out.println();
        System.out.println("Payments: ");
        for(Employee  emp : list){
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }




        sc.close();
    }
}
