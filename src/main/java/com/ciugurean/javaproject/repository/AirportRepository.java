package com.ciugurean.javaproject.repository;

import com.ciugurean.javaproject.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AirportRepository extends JpaRepository<Airport, Long> {
}