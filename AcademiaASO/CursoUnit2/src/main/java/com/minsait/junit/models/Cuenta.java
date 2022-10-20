package com.minsait.junit.models;

import com.minsait.junit.exceptions.DineroInsuficienteException;


import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter


public class Cuenta {
    private String persona;
    private BigDecimal saldo;
    private Banco banco;



    public Cuenta(String persona) {
        this.persona = persona;
    }

    public Cuenta(String persona, BigDecimal saldo) {
        this(persona);
        this.saldo = saldo;
    }

    public void retirar(BigDecimal monto){
        BigDecimal saldoAux = this.saldo.subtract(monto);
        if (saldoAux.compareTo(BigDecimal.ZERO)<0 ){
            throw new DineroInsuficienteException("Dinero insuficiente");
        }this.saldo= saldoAux;

    }

    public void depositar(BigDecimal monto){
        this.saldo= this.saldo.add(monto);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuenta cuenta = (Cuenta) o;

        return Objects.equals(persona, cuenta.persona) && Objects.equals(saldo, cuenta.saldo) && Objects.equals(banco, cuenta.banco);
    }




}
