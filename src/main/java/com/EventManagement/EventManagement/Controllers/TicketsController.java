package com.EventManagement.EventManagement.Controllers;

import com.EventManagement.EventManagement.Models.Tickets;
import com.EventManagement.EventManagement.Services.TicketsServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "tickets")
public class TicketsController {
    TicketsServices ticketsServices;
    @GetMapping(value = "getAll")
    public List<Tickets> getAllTickets() {

        return ticketsServices.getAllTickets();
    }
    @GetMapping(value = "getById")
    public Tickets getTicketById(@RequestParam Long id) {

        return ticketsServices.getTicketById(id);
    }
}
