package com.EventManagement.EventManagement.Repositories;

import com.EventManagement.EventManagement.Models.Events;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Events,Long> {
}
