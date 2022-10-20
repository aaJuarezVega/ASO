package org.axasmart.pooherencia.modelos;

import org.axasmart.pooherencia.modelos.Persona;

public class Profesor extends Persona {
    //En java no se permite la herencia multiple por lo que solo hereda de una sola clase

    private String asignatura;

    public Profesor(){
        System.out.println("Profesor: Declaración implicita de constructor vacio por defecto / sin parametros / constructor por default");
    }

    public Profesor(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {

        return "Buenos días soy el profesor de " + getAsignatura() + ", mi nombre es "  + getNombre();
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nasignatura='" + asignatura + '\'';
    }
}
