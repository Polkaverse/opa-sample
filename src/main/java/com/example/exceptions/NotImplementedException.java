package com.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_IMPLEMENTED)
public class NotImplementedException extends RuntimeException {

    private Throwable cause;

    public NotImplementedException() {
        super("Code is not implemented");
    }

    public NotImplementedException(String msg) {
        super(msg == null ? "Code is not implemented" : msg);
    }

    public NotImplementedException(Throwable cause) {
        super("Code is not implemented");
        this.cause = cause;
    }

    public NotImplementedException(String msg, Throwable cause) {
        super(msg == null ? "Code is not implemented" : msg);
        this.cause = cause;
    }

    public NotImplementedException(Class clazz) {
        super(clazz == null ? "Code is not implemented" : "Code is not implemented in " + clazz);
    }
}
