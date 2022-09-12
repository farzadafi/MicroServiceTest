package com.MicroServiceTest.customer.repository;

import com.MicroServiceTest.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
