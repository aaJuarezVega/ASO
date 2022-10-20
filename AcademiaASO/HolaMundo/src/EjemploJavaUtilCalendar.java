import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {

        Calendar calendario = Calendar.getInstance();
        calendario.set(2020,0,25,19,10,0);

        Date fecha = calendario.getTime();

        System.out.println("Fecha = " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS");
        String fechaConFormato = formato.format(fecha);
        System.out.println("fecha con Formato = " + fechaConFormato);

    }
}
