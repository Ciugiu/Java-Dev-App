package com.ciugurean.javaproject.repository;

import com.ciugurean.javaproject.entity.Plane;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlaneRepository extends JpaRepository<Plane, Long> {
}