package com.ciugurean_tlati.javaproject.controller;

import com.ciugurean_tlati.javaproject.entity.Plane;
import com.ciugurean_tlati.javaproject.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planes")
public class PlaneController {
    @Autowired
    private PlaneService planeService;

    @PostMapping
    public Plane addPlane(@RequestBody Plane plane) {
        return planeService.addPlane(plane);
    }

    @GetMapping
    public List<Plane> getAllPlanes() {
        return planeService.getAllPlanes();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Plane> getPlaneById(@PathVariable Long id) {
        return planeService.getPlaneById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Plane> updatePlane(@PathVariable Long id, @RequestBody Plane planeDetails) {
        return ResponseEntity.ok(planeService.updatePlane(id, planeDetails));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePlane(@PathVariable Long id) {
        planeService.deletePlane(id);
        return ResponseEntity.noContent().build();
    }
}