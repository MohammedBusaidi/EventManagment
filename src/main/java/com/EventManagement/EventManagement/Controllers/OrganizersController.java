package com.EventManagement.EventManagement.Controllers;

import com.EventManagement.EventManagement.Models.Organizers;
import com.EventManagement.EventManagement.Services.OrganizersServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "organizer")
public class OrganizersController {
    OrganizersServices organizersServices;
    @GetMapping(value = "getAll")
    public List<Organizers> getAllOrganizers() {

        return organizersServices.getAllOrganizers();
    }
    public Organizers getOrganizerById(@RequestParam Long id) {

        return organizersServices.getOrganizerById(id);
    }
}
