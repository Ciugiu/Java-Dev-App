package com.ciugurean_tlati.javaproject.repository;

import com.ciugurean_tlati.javaproject.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepository extends JpaRepository<Plane, Long> {
}