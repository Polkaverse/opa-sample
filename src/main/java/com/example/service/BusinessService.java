package com.example.service;

import com.example.service.ExecutionContext;
import org.springframework.http.ResponseEntity;

public interface BusinessService {
    void hydrateAndMapExecutionContext(ExecutionContext executionContext);
    void execute(ExecutionContext executionContext);
    ResponseEntity<?> mapoutApiModel(ExecutionContext executionContext);
}
