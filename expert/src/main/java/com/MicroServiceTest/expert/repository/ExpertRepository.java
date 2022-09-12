package com.MicroServiceTest.expert.repository;

import com.MicroServiceTest.expert.model.Expert;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExpertRepository extends JpaRepository<Expert,Integer> {
}
