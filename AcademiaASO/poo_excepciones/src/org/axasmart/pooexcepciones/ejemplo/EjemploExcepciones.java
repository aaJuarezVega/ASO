package org.axasmart.pooexcepciones.ejemplo;

import java.util.Scanner;

public class EjemploExcepciones {

    public static void main(String[] args){

        Scanner entrada  =  new Scanner(System.in);
        int divisor = Integer.parseInt(entrada);


        try {
            int division = 10 / 5;
            System.out.println(division);
        }catch(ArithmeticException e){
            System.out.println("Capturamos la exception en Runtime!" + e.getMessage());
        }finally {
            System.out.println("Cerrando archivo abierto por el proceso!");
        }
        System.out.println("continuamos con el flujo de nuestra app!");


    }
}
