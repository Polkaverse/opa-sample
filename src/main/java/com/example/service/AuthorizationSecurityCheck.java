package com.example.service;

import com.example.exceptions.AuthorizationSecurityCheckException;

public interface AuthorizationSecurityCheck {
    void doCheck(ExecutionContext executionContext) throws AuthorizationSecurityCheckException;
}
