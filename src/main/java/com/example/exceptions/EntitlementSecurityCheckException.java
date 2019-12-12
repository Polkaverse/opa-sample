package com.example.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.UNAUTHORIZED, reason="Unauthorized entitlement")
public class EntitlementSecurityCheckException extends RuntimeException {
    private Throwable cause;

    public EntitlementSecurityCheckException() {
        super("Entitlement Security exception");
    }

    public EntitlementSecurityCheckException(String msg) {
        super(msg == null ? "Entitlement Security exception" : msg);
    }

    public EntitlementSecurityCheckException(Throwable cause) {
        super("Entitlement Security exception");
        this.cause = cause;
    }

    public EntitlementSecurityCheckException(String msg, Throwable cause) {
        super(msg == null ? "Entitlement Security exception" : msg);
        this.cause = cause;
    }

    public EntitlementSecurityCheckException(Class clazz) {
        super(clazz == null ? "Entitlement Security exception" : "Entitlement Security exception in " + clazz);
    }

}
