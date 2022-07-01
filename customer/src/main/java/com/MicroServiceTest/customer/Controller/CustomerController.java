package com.MicroServiceTest.customer.Controller;

import com.MicroServiceTest.customer.dto.CustomerRegisterRequest;
import com.MicroServiceTest.customer.model.Customer;
import com.MicroServiceTest.customer.service.impel.CustomerServiceImpel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

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
}
