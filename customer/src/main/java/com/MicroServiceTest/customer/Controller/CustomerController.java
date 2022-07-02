package com.MicroServiceTest.customer.Controller;

import com.MicroServiceTest.customer.dto.CustomerRegisterRequest;
import com.MicroServiceTest.customer.exception.CustomerNotFoundException;
import com.MicroServiceTest.customer.model.Customer;
import com.MicroServiceTest.customer.service.impel.CustomerServiceImpel;
import org.hibernate.boot.model.naming.IllegalIdentifierException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.InputMismatchException;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    private final CustomerServiceImpel customerServiceImpel;

    public CustomerController(CustomerServiceImpel customerServiceImpel) {
        this.customerServiceImpel = customerServiceImpel;
    }

    @PostMapping("/register")
    public String registerCustomer(@Valid @RequestBody CustomerRegisterRequest request){
        Customer customer = new Customer(request.getFirstName(),request.getLastName(),request.getEmail());
        customerServiceImpel.save(customer);
        return "OK";
    }

    @GetMapping("checkCustomer/{customerId}")
    public String checkCustomer(@PathVariable("customerId") Integer customerId){
        Customer customer = customerServiceImpel.checkCustomer(customerId).orElseThrow(() -> new CustomerNotFoundException("this customer not found"));
        return "OK";
    }
}
