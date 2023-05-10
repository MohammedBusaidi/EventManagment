package com.EventManagement.EventManagement.Repositories;

import com.EventManagement.EventManagement.Models.Attendees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendeeRepository extends JpaRepository<Attendees,Long> {
}
