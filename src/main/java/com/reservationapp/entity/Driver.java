package com.reservationapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "driver")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String driverLicenseNumber;
    private String addNumber;
    private String address;
    private String contactNumber;
    private String alternateContactNumber;
    private String emailId;

    // Constructors, getters, and setters
}
