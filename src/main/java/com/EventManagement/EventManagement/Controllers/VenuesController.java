package com.EventManagement.EventManagement.Controllers;

import com.EventManagement.EventManagement.Models.Venues;
import com.EventManagement.EventManagement.Services.VenuesServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "venues")
public class VenuesController {
    VenuesServices venuesServices;
    @GetMapping(value = "getAll")
    public List<Venues> getAllVenues() {
        return venuesServices.getAllVenues();
    }
    @GetMapping(value = "getById")
    public Venues getVenueById(@RequestParam Long id) {
        return venuesServices.getVenueById(id);
    }
}
