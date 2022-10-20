package org.axasmart.pooherencia;

import org.axasmart.pooherencia.modelos.Alumno;
import org.axasmart.pooherencia.modelos.AlumnoInternacional;
import org.axasmart.pooherencia.modelos.Persona;
import org.axasmart.pooherencia.modelos.Profesor;

public class EjemploHerenciaToString {
    public static void main(String[] args) {
        Alumno alumno = new Alumno("Alex", "Juarez", 47, "UNITEC CAMPUS SUR");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);
        alumno.setEmail("alex.juarez@hotmail.com");
        System.out.println("===== - =====");

        AlumnoInternacional alumnoInt = new AlumnoInternacional("Peter", "Gosling","Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setColegio("Instituto Nacional - Intercambio");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);
        alumnoInt.setEmail("peter@correo.com");
        System.out.println("===== - =====");

        Profesor profesor = new Profesor("Lucy", "Juarez", "matematicas");
        profesor.setEdad(25);
        profesor.setEmail("l.juarez@hotmail.com");
        System.out.println("===== - =====");


        imprimir(alumno);
        imprimir(alumnoInt);
        imprimir(profesor);


        //Gerarquia de clases
        //Llamado a la gerarquia de clases de Alumno Internacional
        gerarquiaDeClases(alumnoInt);

        //Llamado a la gerarquia de clases del objeto Alumno
        gerarquiaDeClases(alumno);

        //Llamado a la gerarquia de clases del objeto Profesor
        gerarquiaDeClases(profesor);

        //Llamado a la gerarquia de clases del objeto Persona
        Persona persona = new Persona();
        gerarquiaDeClases(persona);


    }

    private static void gerarquiaDeClases(Object pClase ){
        Class clase =  pClase.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre  );

            clase = clase.getSuperclass();

        }
        System.out.println("\n");


    }

    public static void imprimir(Persona persona){
        System.out.println(persona);

    }
}
