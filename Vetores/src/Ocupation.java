import java.util.Locale;
import java.util.Scanner;

public class Ocupation {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        Room[] room = new Room[10];

        System.out.print("How many rooms wil be rented? ");
        int n = scan.nextInt();


        for (int i = 0; i < n; i++) {
            System.out.println("Rent #" + (i + 1) + ":");
            scan.nextLine();

            System.out.print("Name:");
            String name = scan.nextLine();

            System.out.print("Email: ");
            String email = scan.nextLine();

            System.out.print("Room: ");
            int number = scan.nextInt();
            room[number - 1] = new Room(number, name, email);
            System.out.println();
        }

        System.out.println("Busy roons: ");

        for (int i = 0; i < room.length; i++) {

            if (room[i] != null) {
                System.out.println(
                        room[i].getNumber()
                                + ": "
                                + room[i].getNome()
                                + ", "
                                + room[i].getEmail());
            }
        }

        scan.close();
    }
}
