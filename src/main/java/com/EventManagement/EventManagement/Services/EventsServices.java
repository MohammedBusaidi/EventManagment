package com.EventManagement.EventManagement.Services;

import com.EventManagement.EventManagement.Models.Events;
import com.EventManagement.EventManagement.Repositories.EventRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class EventsServices {
    final EventRepository eventRepository;
    public List<Events> getAllEvents() {

        return eventRepository.findAll();
    }

    public Events getEventById(Long id) {

        return eventRepository.findById(id).get();
    }
}
