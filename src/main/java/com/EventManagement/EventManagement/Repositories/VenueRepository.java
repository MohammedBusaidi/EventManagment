package com.EventManagement.EventManagement.Repositories;

import com.EventManagement.EventManagement.Models.Venues;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VenueRepository extends JpaRepository<Venues,Long> {
}
