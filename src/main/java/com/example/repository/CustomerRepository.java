package com.example.repository;

import com.example.model.Customer;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CustomerRepository {

    private List<Customer> repository;

    public CustomerRepository() {
        this.repository = new ArrayList<>();
    }

    public List<Customer> getCustList() {
        return repository;
    }

    public void addCustomer(Customer emp) {
        repository.add(emp);
    }
}
