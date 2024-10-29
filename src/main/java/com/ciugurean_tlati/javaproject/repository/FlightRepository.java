package com.ciugurean_tlati.javaproject.repository;

import com.ciugurean_tlati.javaproject.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;
import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByDepartureCityAndDestinationCityAndDepartureDate(String departureCity, String destinationCity, Date departureDate);
}