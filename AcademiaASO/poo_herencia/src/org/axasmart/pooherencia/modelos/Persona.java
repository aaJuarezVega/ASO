package org.axasmart.pooherencia.modelos;

public class Persona {
    //persona no hereda de forma implicita de ninguna clase,
    // pero en realidad hereda de la clase Object, la clase padre de todas las clases en Java.

    private String nombre;
    private String apellido;
    private int edad;
    private String email;



    public Persona (){
        System.out.println("Persona:Declaración implicita de constructor vacio por defecto / sin parametros por defecto / constructor por default");
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }
    public Persona(String nombre, String apellido, int edad){
        this(nombre, apellido);
        this.edad = edad;
    }

    public Persona(String nombre, String apellido, int edad, String email){
        this(nombre, apellido, edad);
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String saludar(){
        return "Hola que tal!";
    }

    @Override
    public String toString() {
        return  "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", saludo='" + this.saludar();
    }
}
