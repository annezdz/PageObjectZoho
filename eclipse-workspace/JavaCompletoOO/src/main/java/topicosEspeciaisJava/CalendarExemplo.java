package topicosEspeciaisJava;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class CalendarExemplo {
    public static void main(String[] args) {

        //Somando uma unidade de tempo

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        Date d = Date.from(Instant.parse("2022-01-05T15:42:07Z"));
        System.out.println(sdf.format(d));

        //Calendario com a data d instanciada dentro dele

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        //Adicionando 4 horas

//        cal.add(Calendar.HOUR_OF_DAY,4);
//        d = cal.getTime();
//        System.out.println(sdf.format(d));

        // Obtendo uma unidade de tempo, no caso os minutos

        int minutes = cal.get(Calendar.MINUTE);
        int mounth = cal.get(Calendar.MONTH) + 1;
        System.out.println("Minutes = " + minutes);
        System.out.println("Mounth = " + mounth);


    }
}
