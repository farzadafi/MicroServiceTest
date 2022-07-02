package com.MicroServiceTest.expert.Controller;

import com.MicroServiceTest.expert.dto.ExpertRegisterRequest;
import com.MicroServiceTest.expert.model.Expert;
import com.MicroServiceTest.expert.service.impel.ExpertServiceImpel;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/expert")
public class ExpertController {

    private final ExpertServiceImpel expertServiceImpel;

    public ExpertController(ExpertServiceImpel expertServiceImpel) {
        this.expertServiceImpel = expertServiceImpel;
    }

    @PostMapping("/register")
    public String registerExpert(@Valid @RequestBody ExpertRegisterRequest request){
        Expert expert = new Expert(request.getFirstName(),request.getLastName(),request.getEmail());
        expertServiceImpel.save(expert);
        return "OK";
    }

    @GetMapping("checkCustomer/{customerId}")
    public String checkCustomer(@PathVariable("customerId") Integer customerId){
        return expertServiceImpel.checkCustomer(customerId);
    }
}
