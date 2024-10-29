package com.ciugurean_tlati.javaproject.service;

import com.ciugurean_tlati.javaproject.entity.Airport;
import com.ciugurean_tlati.javaproject.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AirportService {
    @Autowired
    private AirportRepository airportRepository;

    public Airport addAirport(Airport airport) {
        return airportRepository.save(airport);
    }

    public List<Airport> getAllAirports() {
        return airportRepository.findAll();
    }

    public Optional<Airport> getAirportById(Long id) {
        return airportRepository.findById(id);
    }

    public Airport updateAirport(Long id, Airport airportDetails) {
        Airport airport = airportRepository.findById(id).orElseThrow();
        airport.setName(airportDetails.getName());
        airport.setCountry(airportDetails.getCountry());
        airport.setCity(airportDetails.getCity());
        return airportRepository.save(airport);
    }

    public void deleteAirport(Long id) {
        airportRepository.deleteById(id);
    }
}