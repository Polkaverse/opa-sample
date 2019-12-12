package com.example.authorizationsecuritycheck;


import com.example.service.AuthorizationSecurityCheck;
//import com.example.businessservice.BusinessService;
import com.example.helpers.AuthorizationSecurityCheckHelper;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.service.ExecutionContext;
import com.example.exceptions.AuthorizationSecurityCheckException;
import com.example.exceptions.NotImplementedException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
* Implement this class.
*/
@Service
public class GetEmployeeAuthorizationSecurityCheck implements AuthorizationSecurityCheck {

    @Autowired
    AuthorizationSecurityCheckHelper authorizationSecurityCheckHelper;

    /**
     * This method must be implemented before its corresponding REST endpoint can be operational
     * The executionContext provides access to all headers. A suggestion is to get the JWT from
     * the header and check the role against the role that is required. Multiple auth checks can be done here.
    */
    @Override
    public void doCheck(ExecutionContext executionContext) throws AuthorizationSecurityCheckException {
        throw new NotImplementedException();
    }

}
