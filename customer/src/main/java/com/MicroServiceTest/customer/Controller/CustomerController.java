package com.MicroServiceTest.customer.Controller;

import com.MicroServiceTest.customer.dto.CustomerRegisterRequest;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/customer")
public class CustomerController {

    @PostMapping("/register")
    public String registerCustomer(@RequestBody CustomerRegisterRequest request){
        return "OK";
    }
}
