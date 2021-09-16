package Dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class DatesFormat {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date y1 = sdf1.parse("25/06/2018");
        Date y2 = sdf2.parse("25/06/2018 15:42:07");

        System.out.println("y1: " + y1);
        System.out.println("y2: " + y2);
        System.out.println();

        System.out.println("y1(sfd2): " + sdf2.format(y1));
        System.out.println("y2(sfd2): " + sdf2.format(y2));
        System.out.println();

        Date x1 = new Date(); //instanciar objeto com a data atual
        System.out.println("x1(sfd1): " + sdf1.format(x1));
        System.out.println("x1(sfd2): " + sdf2.format(x1));
        System.out.println();

        Date x2 = new Date(System.currentTimeMillis());
        //pega o instante do meu sistema, converte para milisegundos,
        // e cria data com este valor
        System.out.println("x2(sfd1): " + sdf1.format(x2));
        System.out.println("x2(sfd2): " + sdf2.format(x2));
        System.out.println();

        Date x3 = new Date(); // sem argumento imprime a data deste momento
        System.out.println("x3(sfd1): " + sdf1.format(x3));
        System.out.println("x3(sfd2): " + sdf2.format(x3));
        System.out.println();

        Date x4 = new Date(0L);//pode passar no argumento o número  de milisegundos qualquer
        System.out.println("x4(sfd1): " + sdf1.format(x4));
        System.out.println("x4(sfd2): " + sdf2.format(x4));
        System.out.println();

        Date x5 = new Date(1000L * 60L * 60L * 3L);//pode passar no argumento o número  de milisegundos qualquer
        System.out.println("x5(sfd1): " + sdf1.format(x5));
        System.out.println("x5(sfd2): " + sdf2.format(x5));
        System.out.println();

        //Padrão ISO 8601 e classe Instant
        Date z1 = Date.from(Instant.parse("2018-06-25T15:42:07Z")); //definido no padão utc  e por isso dá diferença no print
        System.out.println("z1(sfd2): " + sdf2.format(z1)); //Formatado pela zona local
        System.out.println("z1(sfd3): " + sdf3.format(z1)); //Formatado pela zona GMT

    }
}
