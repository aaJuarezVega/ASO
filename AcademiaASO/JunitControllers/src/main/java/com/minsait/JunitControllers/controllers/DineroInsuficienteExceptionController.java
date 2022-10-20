package com.minsait.JunitControllers.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class DineroInsuficienteExceptionController{
    @ExceptionHandler(value = DineroInsuficienteException.class)
    public ResponseEntity<Object> exception(DineroInsuficienteException exception )    {
        return new ResponseEntity<>("Dinero Insuficiente!", HttpStatus.UNAUTHORIZED);
    }

}


