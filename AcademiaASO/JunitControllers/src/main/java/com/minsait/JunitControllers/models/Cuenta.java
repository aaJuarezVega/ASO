package com.minsait.JunitControllers.models;

import com.minsait.JunitControllers.exceptions.DineroInsuficienteException;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class Cuenta {
    private Long id;
    private String persona;
    private BigDecimal saldo;

    public Cuenta(Long id, String persona, BigDecimal saldo) {
        this.id = id;
        this.persona = persona;
        this.saldo = saldo;
    }


    public void retirar(BigDecimal monto){
        BigDecimal nuevoSaldo = this.saldo.subtract(monto);
        if (nuevoSaldo.compareTo(BigDecimal.ZERO) < 0 ){
            throw new DineroInsuficienteException("Dinero insuficiente");
        }this.saldo= nuevoSaldo;

    }
    public void depositar(BigDecimal monto){
        this.saldo = this.saldo.add(monto);
    }

}
