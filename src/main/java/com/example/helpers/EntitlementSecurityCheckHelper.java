package com.example.helpers;

import com.example.exceptions.EntitlementSecurityCheckException;

import org.springframework.stereotype.Service;

@Service
public class EntitlementSecurityCheckHelper {

    public void checkAccountBelowsToJWTOwner(String jwt, String accountId) throws EntitlementSecurityCheckException {
        return;
    }

}
