package com.axasmart.poo.clases.abstractas.form.validador;

public class NumeroValidador extends Validador{


    protected String mensaje = "el campo debe ser número";

    @Override
    public String getMensaje() {
        return mensaje;
    }

    @Override
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;

    }

    @Override
    public boolean esValido(String valor) {
        try{
            Integer.parseInt(valor);
            return true;
        } catch(NumberFormatException e){
            return false;
        }
    }
}
