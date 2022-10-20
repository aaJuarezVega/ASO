package com.minsait.JunitControllers;

import com.minsait.JunitControllers.models.Banco;
import com.minsait.JunitControllers.models.Cuenta;
import org.aspectj.apache.bcel.classfile.Module;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public  class Datos {


    public static final List<Cuenta> CUENTAS= Arrays.asList(
            new Cuenta( 1L, "Lucy", new BigDecimal("50000.00")),
            new Cuenta( 2L, "Mate", new BigDecimal( "10000.00")),
            new Cuenta( 3L, "Alex", new BigDecimal("10000.00"))

    );


    public static final List<Banco> BANCOS= Arrays.asList(
            new Banco(1L, "Bancomer", 1),
            new Banco(2L, "Santander", 1),
            new Banco(3L,"Banorte", 1)
    );

    public static Optional<Cuenta> crearCuenta1(){
        return Optional.of(new Cuenta(1L, "Ricardo", new BigDecimal("10000")));
    }

    public static Optional<Cuenta> crearCuenta2(){
        return Optional.of(new Cuenta(2L, "Bill Gates", new BigDecimal("10000")));
    }

    public static Optional<Cuenta> crearCuenta3(){
        return Optional.of(new Cuenta(3L, "Alex", new BigDecimal("10000")));
    }


}
