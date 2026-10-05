package com.minicrm.Mini_crm.service;

import com.minicrm.Mini_crm.entity.Lead;
import com.minicrm.Mini_crm.repository.LeadRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class LeadService {
    private final LeadRepository leadRepository;

    public LeadService(LeadRepository leadRepository) {
        this.leadRepository = leadRepository;
    }

    public List<Lead> getAllLeads() {
        return leadRepository.findAll();
    }

    public Lead getLeadById(Integer id) {
        return leadRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Lead not found with id: " + id));
    }

    public Lead createLead(Lead lead) {
        return leadRepository.save(lead);
    }
}