package com.reservationapp.playload;

import com.reservationapp.entity.Driver;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;
@Data
public class BusDto {

    private Long busId;


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
    private Driver driver;

}


