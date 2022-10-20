package com.minsait.JunitControllers.models;

import lombok.*;


@Data

public class Banco {
    @NonNull
    private Long id;
    @NonNull
    private String nombre;
    @NonNull
    private int totalTransferencia;



}
