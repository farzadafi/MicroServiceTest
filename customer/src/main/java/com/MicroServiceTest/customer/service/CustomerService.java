package com.MicroServiceTest.customer.service;

import com.MicroServiceTest.customer.model.Customer;

import java.util.Optional;

public interface CustomerService {
    void save(Customer customer);
    Optional<Customer> checkCustomer(Integer customerId);
}
