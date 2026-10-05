package com.minicrm.Mini_crm.service;

import com.minicrm.Mini_crm.entity.Opportunity;
import com.minicrm.Mini_crm.repository.OpportunityRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OpportunityService {
    private final OpportunityRepository opportunityRepository;

    public OpportunityService(OpportunityRepository opportunityRepository) {
        this.opportunityRepository = opportunityRepository;
    }

    public List<Opportunity> getAllOpportunities() {
        return opportunityRepository.findAll();
    }

    public Opportunity getOpportunityById(Integer id) {
        return opportunityRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Opportunity not found with id: " + id));
    }

    public Opportunity createOpportunity(Opportunity opportunity) {
        return opportunityRepository.save(opportunity);
    }
}