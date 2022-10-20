package com.axasmart.poointerfaces;

import com.axasmart.poointerfaces.Interface.CrudRepositorio;
import com.axasmart.poointerfaces.Interface.OrdenableRepositorio;
import com.axasmart.poointerfaces.Interface.PaginableRepositorio;
import com.axasmart.poointerfaces.modelo.Cliente;
import com.axasmart.poointerfaces.repositorio.*;

import java.util.List;

public class EjemploRepositorio {

    public static void main(String[] args) {


        CrudRepositorio repo = new ClienteListRepositorio();
        repo.crear(new Cliente("Lucy", "Juárez"));
        repo.crear(new Cliente("Mateo", "Montiel"));
        repo.crear(new Cliente("Alex", "Juarez"));
        repo.crear(new Cliente("Paty","Ramos"));


        List<Cliente> clientes = repo.listar();

        clientes.forEach(System.out::println);

        System.out.println("==================== paginable ====================");
        List<Cliente> paginable = ((PaginableRepositorio)repo).listar(0,2);
        paginable.forEach(System.out::println);
        System.out.println("==================== paginable ====================");


        System.out.println("__________Editar_____________");
        Cliente Actualizar = new Cliente("Mateo Severo", "Montiel");
        System.out.println("__________Resultado Editar_____________");

        Actualizar.setId(2);
        repo.editar(Actualizar);
        Cliente bea = repo.porId(2);
        System.out.println(bea);
        ((OrdenableRepositorio)repo)
                .listar("nombre", Direccion.ASC).forEach(System.out::println);


        System.out.println("===========eliminar================");
        repo.eliminar(4);
        repo.listar().forEach(System.out::println);


    }
}
