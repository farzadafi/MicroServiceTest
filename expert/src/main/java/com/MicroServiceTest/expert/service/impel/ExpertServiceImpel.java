package com.MicroServiceTest.expert.service.impel;

import com.MicroServiceTest.expert.model.Expert;
import com.MicroServiceTest.expert.repository.ExpertRepository;
import com.MicroServiceTest.expert.service.ExpertService;
import org.springframework.stereotype.Service;

@Service
public class ExpertServiceImpel implements ExpertService {

    private final ExpertRepository expertRepository;

    public ExpertServiceImpel(ExpertRepository expertRepository) {
        this.expertRepository = expertRepository;
    }

    @Override
    public void save(Expert expert) {
        expertRepository.save(expert);
    }
}
