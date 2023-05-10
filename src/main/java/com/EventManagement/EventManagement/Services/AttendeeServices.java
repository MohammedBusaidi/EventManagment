package com.EventManagement.EventManagement.Services;

import com.EventManagement.EventManagement.Models.Attendees;
import com.EventManagement.EventManagement.Repositories.AttendeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class AttendeeServices {
    final AttendeeRepository attendeeRepository;
    public List<Attendees> getAllAttendees() {

        return attendeeRepository.findAll();
    }

    public Attendees getAttendeeById(Long id) {

        return attendeeRepository.findById(id).get();
    }

}
