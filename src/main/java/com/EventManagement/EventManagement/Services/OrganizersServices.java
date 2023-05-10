package com.EventManagement.EventManagement.Services;

import com.EventManagement.EventManagement.Models.Organizers;
import com.EventManagement.EventManagement.Repositories.OrganizerRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class OrganizersServices {
    final OrganizerRepository organizerRepository;
    public List<Organizers> getAllOrganizers() {

        return organizerRepository.findAll();
    }

    public Organizers getOrganizerById(Long id) {

        return organizerRepository.findById(id).get();
    }
}
