package com.EventManagement.EventManagement.Controllers;

import com.EventManagement.EventManagement.Models.Attendees;
import com.EventManagement.EventManagement.Services.AttendeeServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "attendee")
public class AttendeesController {
    AttendeeServices attendeeServices;
    @GetMapping(value = "getAll")
    public List<Attendees> getAllAttendees() {

        return attendeeServices.getAllAttendees();
    }
    @GetMapping(value = "getById")
    public Attendees getAttendeeById(@RequestParam Long id) {

        return attendeeServices.getAttendeeById(id);
    }
}
