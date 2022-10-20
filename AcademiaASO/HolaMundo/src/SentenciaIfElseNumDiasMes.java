import java.util.Scanner;

public class SentenciaIfElseNumDiasMes {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int mes = 0;
        int numeroDias = 0;
        int anio = 0;

        System.out.println("Ingrese el número del mes del 1 - 12 ");
        mes = s.nextInt();

        System.out.println("ingrese el año (YYYY)");
        anio = s.nextInt();

        if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ){
            numeroDias=31;
        }else if (mes == 4 || mes == 6 || mes == 9 || mes == 11 ){
            numeroDias=30;
        }else {
            if (anio % 400 == 0 || ((anio%4 == 0) && !(anio%100==0) )  ){
                numeroDias=29;
            }else {
                numeroDias=28;
            }
        }
        System.out.println("numeroDias = " + numeroDias);

    }
}
