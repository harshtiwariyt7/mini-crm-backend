package com.minicrm.Mini_crm.controller;

import com.minicrm.Mini_crm.entity.Opportunity;
import com.minicrm.Mini_crm.service.OpportunityService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/opportunities")
public class OpportunityController {
    private final OpportunityService opportunityService;

    public OpportunityController(OpportunityService opportunityService) {
        this.opportunityService = opportunityService;
    }

    @GetMapping
    public List<Opportunity> getAllOpportunities() {
        return opportunityService.getAllOpportunities();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Opportunity> getOpportunityById(@PathVariable Integer id) {
        return ResponseEntity.ok(opportunityService.getOpportunityById(id));
    }

    @PostMapping
    public ResponseEntity<Opportunity> createOpportunity(@RequestBody Opportunity opportunity) {
        return ResponseEntity.ok(opportunityService.createOpportunity(opportunity));
    }
}