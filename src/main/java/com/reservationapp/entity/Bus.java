package com.reservationapp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.*;

@Entity
@Table(name = "bus")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long busId;

    @Column(name = "bus_name", unique = true)
    private String busNumber;
    private String busType;
    private String fromLocation;
    private String toLocation;
    private String fromDate;
    private String toDate;
    private String totalDuration;
    private String fromTime;
    private String toTime;
    private double price;
    private int availableSeats;
    private int totalSeats;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "driver_id", referencedColumnName = "id")
    private Driver driver;

    // Constructors, getters, and setters
}
