package com.example.service;

import com.example.service.ExecutionContext;
import com.example.exceptions.ServiceValidationException;


public interface Validator {

    //return execution context
    void validate(ExecutionContext executionContext) throws ServiceValidationException;
}
