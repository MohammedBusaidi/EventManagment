package com.EventManagement.EventManagement.Controllers;

import com.EventManagement.EventManagement.Models.Events;
import com.EventManagement.EventManagement.Services.EventsServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "event")
public class EventsController {
    EventsServices eventsServices;
    @GetMapping(value = "getAll")
    public List<Events> getAllEvents() {

        return eventsServices.getAllEvents();
    }
    @GetMapping(value = "getById")
    public Events getEventById(@RequestParam Long id) {

        return eventsServices.getEventById(id);
    }
}
