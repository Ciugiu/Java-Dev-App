package com.ciugurean_tlati.javaproject.repository;

import com.ciugurean_tlati.javaproject.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {
}