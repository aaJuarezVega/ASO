package org.axasmart.pooherencia;

import org.axasmart.pooherencia.modelos.Alumno;
import org.axasmart.pooherencia.modelos.AlumnoInternacional;
import org.axasmart.pooherencia.modelos.Persona;
import org.axasmart.pooherencia.modelos.Profesor;

public class EjemploHerenciaII {
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
        System.out.println("Imprimiendo de Persona...");
        System.out.println("nombre: " + persona.getNombre()
                + " apellido: " + persona.getApellido()
                + " edad: " + persona.getEdad()
                + " email: " + persona.getEmail());
        if(persona instanceof Alumno){
            System.out.println("Imprimiendo de Alumno...");
            System.out.println("Institucion:" + ((Alumno) persona).getColegio());
            System.out.println("Nota Castellano: " + ((Alumno) persona).getNotaCastellano());
            System.out.println("Nota Historia: " + ((Alumno) persona).getNotaHistoria());
            System.out.println("Nota Matematicas: " + ((Alumno) persona).getNotaMatematica());


            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo de Alumno Internacional...");
                System.out.println("Nota Idiomas: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("Pais: " + ((AlumnoInternacional) persona).getPais());
            }
            System.out.println("Promedio = " + ((Alumno) persona).calcularPromedio());

        }

        if(persona instanceof Profesor){
            System.out.println("Imprimiendo de Profesor...");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }

        System.out.println("========== - ==========");

        System.out.println(persona.saludar());

        System.out.println("========== - ==========");

    }
}
