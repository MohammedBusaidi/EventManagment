package com.EventManagement.EventManagement.Services;

import com.EventManagement.EventManagement.Models.Vendors;
import com.EventManagement.EventManagement.Repositories.VendorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class VendorsServices {
    final VendorRepository vendorRepository;
    public List<Vendors> getAllVendors() {

        return vendorRepository.findAll();
    }

    public Vendors getVendorById(Long id) {

        return vendorRepository.findById(id).get();
    }
}
