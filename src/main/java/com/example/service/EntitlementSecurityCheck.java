package com.example.service;
import com.example.exceptions.EntitlementSecurityCheckException;

public interface EntitlementSecurityCheck {
    void doCheck(ExecutionContext executionContext) throws EntitlementSecurityCheckException;
}
