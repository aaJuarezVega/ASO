package com.axasmart.poointerfaces.Interface;

import com.axasmart.poointerfaces.modelo.Cliente;
import com.axasmart.poointerfaces.repositorio.Direccion;

import java.util.List;

public interface OrdenableRepositorio {
    List<Cliente> listar(String campo, Direccion dir);


    static int ordenar(String campo,Cliente a, Cliente b){
        int resultado = 0;
        switch(campo){
            case "id" ->
                    resultado = a.getId().compareTo(b.getId());
            case "nombre" ->
                    resultado = a.getNombre().compareTo(b.getNombre());
            case "apellido" ->
                    resultado = a.getApellido().compareTo(b.getApellido());

        }
        return resultado;
    }

}
