package com.axasmart.poo.clases.abstractas.form.elementos;

abstract public class ElementoForm {

    protected String valor;
    protected String nombre;

    public ElementoForm() {
    }

    public ElementoForm(String nombre) {
        this();  //llama el constructor vacío.
        this.nombre = nombre;
    }


    public void setValor(String valor) {
        this.valor = valor;
    }

    abstract public String dibujarHtml();
}
