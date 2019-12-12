package com.example.entitlementssecuritycheck;

import com.example.service.ExecutionContext;
import com.example.helpers.EntitlementSecurityCheckHelper;
import com.example.service.EntitlementSecurityCheck;
import com.example.exceptions.NotImplementedException;
import com.example.exceptions.EntitlementSecurityCheckException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* Implement this class.
*/
@Service
public class GetEmployeeEntitlementsSecurityCheck implements EntitlementSecurityCheck {

    @Autowired
    EntitlementSecurityCheckHelper entitlementSecurityCheckHelper;

    /**
     * This method must be implemented. Its suggested use is to check that the user has the proper entitlements, which may require a call to an external service
    */
    @Override
    public void doCheck(ExecutionContext executionContext) throws EntitlementSecurityCheckException {
        throw new NotImplementedException();
    }

}

