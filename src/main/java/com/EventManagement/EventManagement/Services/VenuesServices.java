package com.EventManagement.EventManagement.Services;

import com.EventManagement.EventManagement.Models.Venues;
import com.EventManagement.EventManagement.Repositories.VenueRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VenuesServices {
    final VenueRepository venueRepository;
    public List<Venues> getAllVenues() {

        return venueRepository.findAll();
    }

    public Venues getVenueById(Long id) {

        return venueRepository.findById(id).get();
    }
}
