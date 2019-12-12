package com.example.helpers;

import com.example.exceptions.AuthorizationSecurityCheckException;
import org.springframework.stereotype.Service;

@Service
public class AuthorizationSecurityCheckHelper {

    public void checkForValidJWT(String jwt) throws AuthorizationSecurityCheckException {
        return;
    }

    public String findTrustProviderForJWT(String jwt) throws AuthorizationSecurityCheckException {
        return "B2C";
    }

}
