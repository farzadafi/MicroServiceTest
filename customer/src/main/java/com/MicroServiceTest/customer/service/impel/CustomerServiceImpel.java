package com.MicroServiceTest.customer.service.impel;

import com.MicroServiceTest.customer.model.Customer;
import com.MicroServiceTest.customer.repository.CustomerRepository;
import com.MicroServiceTest.customer.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpel implements CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerServiceImpel(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public Optional<Customer> checkCustomer(Integer customerId) {
        return customerRepository.findById(customerId);
    }
}
