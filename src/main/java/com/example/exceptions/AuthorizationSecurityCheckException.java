package com.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason="Unauthorized")
public class AuthorizationSecurityCheckException extends RuntimeException {

    private Throwable cause;

    public AuthorizationSecurityCheckException() {
        super("Authorization Security exception");
    }

    public AuthorizationSecurityCheckException(String msg) {
        super(msg == null ? "Authorization Security exception" : msg);
    }

    public AuthorizationSecurityCheckException(Throwable cause) {
        super("Authorization Security exception");
        this.cause = cause;
    }

    public AuthorizationSecurityCheckException(String msg, Throwable cause) {
        super(msg == null ? "Authorization Security exception" : msg);
        this.cause = cause;
    }

    public AuthorizationSecurityCheckException(Class clazz) {
        super(clazz == null ? "Authorization Security exception" : "Authorization Security exception in " + clazz);
    }

}
