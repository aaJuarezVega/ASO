
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputConsola {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero");
        //String numberStr = scanner.nextLine();
        int iDecimal = 0;
        try{
            iDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr)
        }catch (InputMismatchException e){
            System.out.println("Error, ingrese un numero de tipo entero");
            main(args);
            System.exit(0);

        }



        String mensaje = "numero 1";
        mensaje += "\n" + "numero 2";
        mensaje += "\n" +  "numero 3";
        mensaje += "\n" + "numero 4";
        System.out.println("El numero decimal =" + iDecimal);






    }
}
