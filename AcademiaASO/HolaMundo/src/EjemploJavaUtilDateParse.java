import javax.sql.rowset.serial.SQLOutputImpl;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Ingrese una fecha con formato dd-mm-yyyy");
        try {
            //Date fecha = format.parse("2020-05-10"); //
            Date fecha = format.parse(s.next());

            System.out.println("fecha = " + fecha);
            System.out.println(format.format(fecha));

            Date fecha2 = new Date();
            System.out.println("Fecha de sistema = " + fecha2);

            if (fecha.after(fecha2)){
                System.out.println("fecha ingresada es posterior a fecha de sistema");
            } else if (fecha.before(fecha2)) {
                System.out.println("fecha ingresda es anterior a fecha de sistema");
            } else if (fecha.equals(fecha2)) {
                System.out.println("fecha ingresada es igual a fecha de sistema");
                
            }


        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


    }
}
