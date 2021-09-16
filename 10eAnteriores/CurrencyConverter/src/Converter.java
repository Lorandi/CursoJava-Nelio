import java.util.Locale;
import java.util.Scanner;

public class Converter {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        Currency.exchange = sc.nextDouble();

        System.out.print("How many dollars wil be bought? ");
        Currency.amountDollar = sc.nextDouble();

        System.out.println("Amount to be paid in reais = " + String.format("%.2f", Currency.convert(Currency.exchange, Currency.amountDollar)));

        sc.close();

    }
}
