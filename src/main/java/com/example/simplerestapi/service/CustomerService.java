package com.example.simplerestapi.service;

import com.example.simplerestapi.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Customer getById(Long id);
    void save(Customer customer);
    void delete(Long id);
    List<Customer> getAll();
}
