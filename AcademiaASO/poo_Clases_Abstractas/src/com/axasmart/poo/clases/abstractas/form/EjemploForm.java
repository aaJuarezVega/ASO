package com.axasmart.poo.clases.abstractas.form;

import com.axasmart.poo.clases.abstractas.form.elementos.ElementoForm;
import com.axasmart.poo.clases.abstractas.form.elementos.InputForm;
import com.axasmart.poo.clases.abstractas.form.elementos.SelectForm;
import com.axasmart.poo.clases.abstractas.form.elementos.TextareaForm;
import com.axasmart.poo.clases.abstractas.form.elementos.select.Opcion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        InputForm password = new InputForm("clave", "password");
        InputForm email = new InputForm("email", "email");
        InputForm edad =  new InputForm("edad", "number");

        TextareaForm experiencia =  new TextareaForm("exp", 5,9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        Opcion java = new Opcion("1", "Java");

        //opcion para cambiar el valor seleccionado de la lista
        //Opcion typeScript = new Opcion("4", "TypeScript");

        lenguaje.addOpcion(java)
        .addOpcion(new Opcion("2", "Python"))
        .addOpcion(new Opcion("3", "Javascript"))
        .addOpcion(new Opcion("4", "Typescript").setSelected(true))
                // .addOpcion(typeScript)
        .addOpcion(new Opcion("5", "PHP"));

        // forma alterna de crear dibujarHtml
        // Elemento anónimo --> clase implementada al vuelo / Clase anónima, no se puede reutilizar en otra clase
        ElementoForm saludar = new ElementoForm("saludo") {

            @Override
            public String dibujarHtml() {
                return "<input disabled name ='" + this.nombre + "' value=\"" + this.valor + "\">";
            }
        };

        saludar.setValor("Hola que tal este campo no se puede modificar");
        username.setValor("john.doe");
        password.setValor("1234");
        email.setValor("john.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor("... mas de 10 años de experiencia ...");
        java.setSelected(true);

        /*List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);*/

        //Linea indica que valor debe seleccionar de la lista
       // typeScript.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(username,
                password,
                email,
                edad,
                experiencia,
                lenguaje,
                saludar);

        for (ElementoForm e: elementos){
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        }



    }
}
