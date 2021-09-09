import java.sql.SQLOutput;
import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

/*        System.out.println("Enter product data: " );

        System.out.print("Name: ");
        String name = sc.next();

        System.out.print("Price: ");
        double price = sc.nextDouble();

        System.out.print("Quantity in stock: ");
        int stock = sc.nextInt();*/

        System.out.println();

        Product p1 = new Product();
        System.out.print("Name: ");
        p1.setName(sc.next());
        System.out.print("Price: ");
        p1.setPrice(sc.nextDouble());
        System.out.print("Quantity in stock: ");
        p1.setQuantity(sc.nextInt());
        System.out.println(p1.toString());


        System.out.print("Enter the number of product to be added to stock: ");
        int add = sc.nextInt();
        p1.addProducts(add);
        System.out.println(p1);

        System.out.print("Enter the number of product to be removed from stock: ");
        int remove = sc.nextInt();
        p1.removeProducts(remove);
        System.out.println(p1);

        sc.close();

    }
}
