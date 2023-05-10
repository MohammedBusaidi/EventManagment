package com.EventManagement.EventManagement.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Vendors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    Boolean manufacturers_type;
    Boolean wholesalers_type;
    Boolean retailers_type;
    Boolean maintenance_type;
    Boolean service_type;
}
