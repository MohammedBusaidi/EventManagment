package com.EventManagement.EventManagement.Repositories;

import com.EventManagement.EventManagement.Models.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Tickets,Long> {
}
