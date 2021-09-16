import java.util.Scanner;

public class Contas {
    public static void main(String[] args) {

        Conta conta;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int account = scan.nextInt();

        System.out.print("Enter account holder: ");
        scan.nextLine();
        String holder = scan.nextLine();

        System.out.print("Is there na initial deposit (y/n)? ");
        char response = scan.next().charAt(0);


        if (response == 'y') {
            System.out.print("Enter inital deposit valuer: ");
            double initialDeposit = scan.nextDouble();
            conta =  new Conta(account, holder, initialDeposit);
        }else{
            conta = new Conta(account, holder);
        }

        System.out.println();
        System.out.println("Account data:");
        System.out.println(conta);
        System.out.println();

        System.out.print("Enter a deposit value: ");
        conta.deposit(scan.nextDouble());
        System.out.println("Update account data:");
        System.out.println(conta);

        System.out.println();

        System.out.print("Enter a withdraw value: ");
        conta.withdraw(scan.nextDouble());
        System.out.println("Update account data:");
        System.out.println(conta);


        scan.close();
    }
}
