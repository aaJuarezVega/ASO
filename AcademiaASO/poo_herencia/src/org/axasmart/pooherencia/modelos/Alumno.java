package org.axasmart.pooherencia.modelos;

public class Alumno extends Persona {
    //En java no se permite la herencia multiple por lo que solo hereda de una sola clase

    private String colegio;
    private double notaMatematica;
    private double notaCastellano;
    private double notaHistoria;

    public Alumno() {
        System.out.println("Alumno: Declaración implicita de constructor vacio por defecto / sin parametros / constructor por Default");
    }

    public Alumno(String nombre, String apellido){
        super(nombre, apellido);
    }

    public Alumno(String nombre, String apellido, int edad){
        super(nombre, apellido, edad);
    }

    public Alumno(String nombre, String apellido, int edad, String colegio){
        super(nombre, apellido, edad);
        this.colegio = colegio;
    }

    public Alumno(String nombre, String apellido, int edad, String colegio
                , double notaCastellano, double notaHistoria, double notaMatematica){
        this(nombre, apellido, edad, colegio);
        this.notaCastellano = notaCastellano;
        this.notaHistoria = notaHistoria;
        this.notaMatematica = notaMatematica;
    }
    public String getColegio() {
        return colegio;
    }

    public void setColegio(String colegio) {
        this.colegio = colegio;
    }

    public double getNotaMatematica() {
        return notaMatematica;
    }

    public void setNotaMatematica(double notaMatematica) {
        this.notaMatematica = notaMatematica;
    }

    public double getNotaCastellano() {
        return notaCastellano;
    }

    public void setNotaCastellano(double notaCastellano) {
        this.notaCastellano = notaCastellano;
    }

    public double getNotaHistoria() {
        return notaHistoria;
    }

    public void setNotaHistoria(double notaHistoria) {
        this.notaHistoria = notaHistoria;
    }

    @Override
    public String saludar() {
        String saludar = super.saludar();
        return saludar + " soy alumno y mi nombre es " + getNombre();
    }

    public double calcularPromedio(){
        return (notaMatematica + notaHistoria + notaCastellano) / 3;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\ncolegio='" + colegio + '\'' +
                ", nota Matematica=" + notaMatematica +
                ", nota Castellano=" + notaCastellano +
                ", nota Historia=" + notaHistoria +
                ", promedio=" + this.calcularPromedio();
    }
}
