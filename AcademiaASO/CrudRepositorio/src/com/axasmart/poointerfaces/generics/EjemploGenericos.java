package com.axasmart.poointerfaces.generics;

import com.axasmart.poointerfaces.modelo.Cliente;
import com.axasmart.poointerfaces.modelo.ClientePremium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EjemploGenericos {

    public static void main(String[] args) {

        List<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Andres","Guzman"));

        Cliente andres = clientes.iterator().next();

        Cliente[] clientesArreglo = {new Cliente("Luci","Juarez")
                , new Cliente("Mateo","Montiel")};

        Integer[] enterosArreglo = {1,2,3};

        List<Cliente> clientesLista = fromArrayToList(clientesArreglo);
        List<Integer> enterosLista = fromArrayToList(enterosArreglo);


        clientesLista.forEach(System.out::println);
        enterosLista.forEach(System.out::println);

        List<String> nombres = fromArrayToList(new String[] {"Lucy", "Mateo", "Eva"}, enterosArreglo);
        nombres.forEach(System.out::println);

        List<ClientePremium> clientesPremiumList = fromArrayToList(
                new ClientePremium[] {new ClientePremium("Paco", "Fernández")});

        imprimirClientes(clientes);
        imprimirClientes(clientesLista);

        System.out.println("\nLista de Clientes Premium:\n");
        imprimirClientes(clientesPremiumList);

    }

    //Crear Método Genérico
//    public static  List<Cliente> fromArrayToList(Cliente[] c) {
//        return Arrays.asList(c);
//    }
    //En el ejemplo de abajo se crea el método para la clase Cliente,
    // pero lo podemos adecuar para que reciba cualquier tipo de objeto
    // eso lo logramos indicango el generico <T>

    public static <T> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }

    public static <T extends Number> List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }


    public static <T extends Cliente & Comparable<T> > List<T> fromArrayToList(T[] c) {
        return Arrays.asList(c);
    }
    public static <T, G> List<T> fromArrayToList(T[] c, G[] g) {
        for (G elemento: g){
            System.out.println(elemento);
        }

        return Arrays.asList(c);
    }

    public static void imprimirClientes(List<? extends Cliente> clientes){
        clientes.forEach(System.out::println);

    }

}
