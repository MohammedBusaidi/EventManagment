package com.EventManagement.EventManagement.Services;

import com.EventManagement.EventManagement.Models.Sponsor;
import com.EventManagement.EventManagement.Repositories.SponsorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class SponsorServices {
    final SponsorRepository sponsorRepository;
    public List<Sponsor> getAllSponsors() {

        return sponsorRepository.findAll();
    }

    public Sponsor getSponsorById(Long id) {

        return sponsorRepository.findById(id).get();
    }
}
