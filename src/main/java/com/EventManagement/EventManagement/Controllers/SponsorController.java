package com.EventManagement.EventManagement.Controllers;

import com.EventManagement.EventManagement.Models.Sponsor;
import com.EventManagement.EventManagement.Services.SponsorServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "sponsor")
public class SponsorController {
    SponsorServices sponsorServices;
    @GetMapping(value = "getALl")
    public List<Sponsor> getAllSponsors() {

        return sponsorServices.getAllSponsors();
    }
    @GetMapping(value = "getById")
    public Sponsor getSponsorById(@RequestParam Long id) {

        return sponsorServices.getSponsorById(id);
    }
}
