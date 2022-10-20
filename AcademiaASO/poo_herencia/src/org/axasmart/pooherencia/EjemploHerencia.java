package org.axasmart.pooherencia;

import org.axasmart.pooherencia.modelos.Alumno;
import org.axasmart.pooherencia.modelos.AlumnoInternacional;
import org.axasmart.pooherencia.modelos.Persona;
import org.axasmart.pooherencia.modelos.Profesor;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Alex");
        alumno.setApellido("Juarez");
        alumno.setColegio("Instituto Nacional");
        alumno.setNotaCastellano(5.5);
        alumno.setNotaHistoria(6.3);
        alumno.setNotaMatematica(4.9);

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Peter");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setPais("Australia");
        alumnoInt.setEdad(15);
        alumnoInt.setColegio("Instituto Nacional - Intercambio");
        alumnoInt.setNotaIdiomas(6.8);
        alumnoInt.setNotaCastellano(6.2);
        alumnoInt.setNotaHistoria(5.8);
        alumnoInt.setNotaMatematica(6.5);

        Profesor profesor = new Profesor();
        profesor.setNombre("Lucy");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matematicas");


        System.out.println("alumno = " + alumno.getNombre()
                + " " + alumno.getApellido()
                + " " + alumno.getColegio() );
        System.out.println("alumno Internacional= " + alumnoInt.getNombre()
                + " " + alumnoInt.getApellido()
                + " " + alumnoInt.getColegio()
                + " " + alumnoInt.getPais());

        System.out.println("profesor = " + profesor.getAsignatura()
                    + ": " + profesor.getNombre()
                    + " " + profesor.getApellido());

        System.out.println(" \n\n");

        //Gerarquia de clases
        //Llamado a la gerarquia de clases de Alumno Internacional
        GerarquiaDeClases(alumnoInt);

        //Llamado a la gerarquia de clases del objeto Alumno
        GerarquiaDeClases(alumno);

        //Llamado a la gerarquia de clases del objeto Profesor
        GerarquiaDeClases(profesor);

        //Llamado a la gerarquia de clases del objeto Persona
        Persona persona = new Persona();
        GerarquiaDeClases(persona);





    }

    private static void GerarquiaDeClases(Object pClase ){
        Class clase =  pClase.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre  );

            clase = clase.getSuperclass();

        }
        System.out.println("\n");


    }
}
