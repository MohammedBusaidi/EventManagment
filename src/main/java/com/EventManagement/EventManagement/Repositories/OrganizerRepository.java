package com.EventManagement.EventManagement.Repositories;

import com.EventManagement.EventManagement.Models.Organizers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrganizerRepository extends JpaRepository<Organizers,Long> {
}
