package com.example.validator;


import com.example.exceptions.NotImplementedException;
import com.example.service.ExecutionContext;
import com.example.service.Validator;

import org.springframework.stereotype.Service;

/**
* Implement this class.
*/
@Service
public class GetEmployeeValidator implements Validator {

    /**
    * This method must be implemented. It validates the request.
    */
    @Override
    public void validate(ExecutionContext executionContext) {
        throw new NotImplementedException();
    }

}

