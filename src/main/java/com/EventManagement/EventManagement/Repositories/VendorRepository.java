package com.EventManagement.EventManagement.Repositories;

import com.EventManagement.EventManagement.Models.Vendors;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VendorRepository extends JpaRepository<Vendors,Long> {
}
