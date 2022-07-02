package com.MicroServiceTest.expert.service.impel;

import com.MicroServiceTest.expert.model.Expert;
import com.MicroServiceTest.expert.repository.ExpertRepository;
import com.MicroServiceTest.expert.service.ExpertService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExpertServiceImpel implements ExpertService {

    private final ExpertRepository expertRepository;
    private final RestTemplate restTemplate;

    public ExpertServiceImpel(ExpertRepository expertRepository, RestTemplate restTemplate) {
        this.expertRepository = expertRepository;
        this.restTemplate = restTemplate;
    }

    @Override
    public void save(Expert expert) {
        expertRepository.save(expert);
    }

    @Override
    public String checkCustomer(Integer customerId) {
        return restTemplate.getForObject(
                "http://localhost:8080/api/customer/checkCustomer/{customerId}",
                String.class,
                customerId
        );
    }
}
