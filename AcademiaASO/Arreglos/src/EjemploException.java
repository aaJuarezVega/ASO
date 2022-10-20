import javax.swing.*;

public class EjemploException {
    public static void main(String[] args) {

        Calculadora cal = new Calculadora();
        String valor = JOptionPane.showInputDialog("Ingrese el numerador");

        int divisor = Integer.parseInt(valor);

        double division = cal.dividir(10,divisor);

        try{
             division = 10/0;
            System.out.println(division);

        }catch(ArithmeticException e){
            System.out.println("capturamos la exception en tiempo de ejecucion,  Causa:" + e.getCause()+" msg "+e.getMessage() + " localizacion " +  e.getLocalizedMessage());
        }
        System.out.println("Continuamos con el flujo de aplicacion!");
        System.out.println("args = " + args);
    }


}
