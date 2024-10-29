package com.ciugurean.javaproject.service;

import com.ciugurean.javaproject.entity.Plane;
import com.ciugurean.javaproject.repository.PlaneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PlaneService {
    @Autowired
    private PlaneRepository planeRepository;

    public Plane addPlane(Plane plane) {
        return planeRepository.save(plane);
    }

    public List<Plane> getAllPlanes() {
        return planeRepository.findAll();
    }

    public Optional<Plane> getPlaneById(Long id) {
        return planeRepository.findById(id);
    }

    public Plane updatePlane(Long id, Plane planeDetails) {
        Plane plane = planeRepository.findById(id).orElseThrow();
        plane.setBrand(planeDetails.getBrand());
        plane.setModel(planeDetails.getModel());
        plane.setManufacturingYear(planeDetails.getManufacturingYear());
        return planeRepository.save(plane);
    }

    public void deletePlane(Long id) {
        planeRepository.deleteById(id);
    }
}