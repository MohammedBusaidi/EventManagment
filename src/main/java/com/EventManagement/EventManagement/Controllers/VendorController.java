package com.EventManagement.EventManagement.Controllers;

import com.EventManagement.EventManagement.Models.Vendors;
import com.EventManagement.EventManagement.Services.VendorsServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "vendor")
public class VendorController {
    VendorsServices vendorsServices;
    @GetMapping(value = "getAll")
    public List<Vendors> getAllVendors() {

        return vendorsServices.getAllVendors();
    }
    @GetMapping(value = "getById")
    public Vendors getVendorById(Long id) {

        return vendorsServices.getVendorById(id);
    }
}
