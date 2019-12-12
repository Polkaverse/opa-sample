package com.example.analyticseventupdate;

import com.example.exceptions.NotImplementedException;
import com.example.service.ExecutionContext;
import com.example.service.AnalyticsEventUpdate;


import org.springframework.stereotype.Service;

/**
* Implement this class.
*/
@Service
public class GetEmployeeAnalyticsEventUpdate implements AnalyticsEventUpdate {

    /**
    * This method must be implemented. It pushes events to custom pipeline.
    */
    @Override
    public void doUpdate(ExecutionContext executionContext) {
        throw new NotImplementedException();
    }

}
