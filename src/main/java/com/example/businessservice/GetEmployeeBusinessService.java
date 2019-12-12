package com.example.businessservice;

import com.example.model.Customer;
import com.example.service.BusinessService;
import com.example.exceptions.NotImplementedException;
import com.example.service.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import java.util.Map;
import java.util.List;


/**
* Implement this class.
*/
@Service
public class GetEmployeeBusinessService implements BusinessService {

    /**
     * This method must be implemented. Its suggested use is for gathering all of the data needed to successfully execute the request
    */
    @Override
    public void hydrateAndMapExecutionContext(ExecutionContext executionContext) {
        throw new NotImplementedException();
    }

    /**
     * This method must be implemented. Its suggested use is to execute the core business logic of the request, and to store the result in the executionContext
    */
    @Override
    public void execute(ExecutionContext executionContext) {
        throw new NotImplementedException();
    }

    /**
     * This method must be implemented. Its suggested use is to build the rest response
    */
    @Override
    public ResponseEntity<List<Customer>>  mapoutApiModel(ExecutionContext executionContext) {
        throw new NotImplementedException();
    }

}

