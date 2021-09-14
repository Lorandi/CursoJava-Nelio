package aplication;

import entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {
        List<Employee> listEmployee = new ArrayList<>();

        Scanner scan = new Scanner(System.in);

        Employee employee;

        System.out.print("How many employees will be registered? ");

        int number = scan.nextInt();

        for (int i = 0; i < number; i++) {
            System.out.println("Employee #" + (i + 1));

            System.out.print("Id: ");
            int id = scan.nextInt();

            System.out.print("Name: ");
            scan.nextLine();
            String name = scan.nextLine();

            System.out.print("Salary: ");
            double salary = scan.nextDouble();

            listEmployee.add(new Employee(id, name, salary));
            System.out.println();

        }



        System.out.print("Enter the employee id that will have the salary increase: ");
        int idIncreaseSalary = scan.nextInt();

        Employee employeeIncreaseSalary = listEmployee.stream().filter(x -> x.getId() == idIncreaseSalary).findFirst().orElse(null);

        if (employeeIncreaseSalary != null){
            System.out.print("Enter the percentage: ");
            double percentage = scan.nextDouble();

            employeeIncreaseSalary.increaseSalary(percentage);
        }else{
            System.out.println("This Id does not exist!");
        }

        System.out.println();

        System.out.println("List of employee: ");

        for (Employee x : listEmployee) {
            System.out.println(x.toString());
        }
        scan.close();
    }
}
