package com.EventManagement.EventManagement.Services;

import com.EventManagement.EventManagement.Models.Tickets;
import com.EventManagement.EventManagement.Repositories.TicketRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class TicketsServices {
    final TicketRepository ticketRepository;
    public List<Tickets> getAllTickets() {

        return ticketRepository.findAll();
    }

    public Tickets getTicketById(Long id) {

        return ticketRepository.findById(id).get();
    }
}
