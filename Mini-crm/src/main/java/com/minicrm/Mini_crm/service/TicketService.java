package com.minicrm.Mini_crm.service;

import com.minicrm.Mini_crm.entity.Ticket;
import com.minicrm.Mini_crm.repository.TicketRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TicketService {
    private final TicketRepository ticketRepository;

    public TicketService(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }

    public Ticket getTicketById(Integer id) {
        return ticketRepository.findById(id)
            .orElseThrow(() -> new RuntimeException("Ticket not found with id: " + id));
    }

    public Ticket createTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}