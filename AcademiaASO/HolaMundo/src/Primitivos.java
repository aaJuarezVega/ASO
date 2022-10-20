import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.*;
import java.util.Arrays;

public class Primitivos {
    public static void main(String[] args) {



        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en bytes a " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("Valor maxiomo de un byte " + Byte.MAX_VALUE);
        System.out.println("Valor minimo de un byte " + Byte.MIN_VALUE);

        short sNumero = 0;
        String strNumero1 =  JOptionPane.showInputDialog(null, "Ingrese un número Short :");
        try{
            sNumero = Short.parseShort(strNumero1);
        }catch (NumberFormatException e){
            System.out.println("Error, ingrese un numero de tipo short");
            main(args);
            System.exit(0);

        }


        System.out.println("sNumero = " + sNumero);
        System.out.println("Tipo short corresponde en bytes a  " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a" + Short.SIZE);
        System.out.println("Valor maxiomo de un short " + Short.MAX_VALUE);
        System.out.println("Valor minimo de un short" + Short.MIN_VALUE);

        String strNumero2 =  JOptionPane.showInputDialog(null, "Ingrese un numero integer: ");
        int iNumero = Integer.parseInt(strNumero2);

        System.out.println("iNumero = " + iNumero);
        System.out.println("Tipo int corresponde en bytes a  " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a " + Integer.SIZE);
        System.out.println("Valor maxiomo de un int " + Integer.MAX_VALUE);
        System.out.println("Valor minimo de un int" + Integer.MIN_VALUE);

        String strNumero3 = JOptionPane.showInputDialog(null, "Ingrese un numero long: ");
        long lNumero = Long.parseLong(strNumero3);

        System.out.println("lNumero = " + lNumero);
        System.out.println("Tipo long corresponde en bytes a  " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("Valor maxiomo de un long " + Long.MAX_VALUE);
        System.out.println("Valor minimo de un long" + Long.MIN_VALUE);

        String strNumero4  = JOptionPane.showInputDialog(null, "Ingrese un numero float :");
        float fNumero =  Float.parseFloat(strNumero4);

        System.out.println("fNumero = " + fNumero);
        System.out.println("Tipo float corresponde en bytes a  " + Float.BYTES);
        System.out.println("Tipo float corresponde en bites a " + Float.SIZE);
        System.out.println("Valor maxiomo de un float " + Float.MAX_VALUE);
        System.out.println("Valor minimo de un float " + Float.MIN_VALUE);

        double dNumero = 9.454543454;

        System.out.println("dNumero = " + dNumero);
        System.out.println("Tipo double corresponde en bytes a  " + Double.BYTES);
        System.out.println("Tipo double corresponde en bites a " + Double.SIZE);
        System.out.println("Valor maxiomo de un double " + Double.MAX_VALUE);
        System.out.println("Valor minimo de un double " + Double.MIN_VALUE);



        /*Assignation de un long, flotante y string a una variable de tipo VAR, la cual se ajusta al tipo de variable segÚn su valor*/
        var lNumeroVar = 9223372036854775807l;
        var fNumeroVar = 9223372036854775808f;
        var dNumeroVar = 3.1416;
        var stringVar = "Ejemplo de variable string";

        String mensaje = "numero 1";
        mensaje += "\n" + "numero 2";
        mensaje += "\n" +  "numero 3";
        mensaje += "\n" + "numero 4";
        JOptionPane.showMessageDialog(null, mensaje);





    }
}
