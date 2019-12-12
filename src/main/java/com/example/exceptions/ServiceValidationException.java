package com.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNPROCESSABLE_ENTITY, reason="Validation exception")
public class ServiceValidationException extends RuntimeException {

    private Throwable cause;

    public ServiceValidationException() {
        super("Validation exception");
    }

    public ServiceValidationException(String msg) {
        super(msg == null ? "Validation exception" : msg);
    }

    public ServiceValidationException(Throwable cause) {
        super("Validation exception");
        this.cause = cause;
    }

    public ServiceValidationException(String msg, Throwable cause) {
        super(msg == null ? "Validation exception" : msg);
        this.cause = cause;
    }

    public ServiceValidationException(Class clazz) {
        super(clazz == null ? "Validation exception" : "Validation exception in " + clazz);
    }

}
