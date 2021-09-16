package Dates;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class CalendarData {

    public static void main(String[] args) {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));
        System.out.println("Hora GMT:" + sdf.format(d));

        //Somando uma unidade de tempo
        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);
        d = cal.getTime();
        System.out.println("Data com 4 horas a mais: " + sdf.format(d));

        cal.add(Calendar.YEAR, 2 );
        d = cal.getTime();
        System.out.println("Data com 2 anos a mais: " + sdf.format(d));


        //Obtendo uma unidade de tempo
        int minutes = cal.get(Calendar.MINUTE);
        int month = 1 + cal.get(Calendar.MONTH);  // Para calendar, mês começa com valor 0 por isso é necessário acrescentar 1
        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);


    }
}


