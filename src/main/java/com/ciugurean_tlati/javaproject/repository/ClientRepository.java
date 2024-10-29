package com.ciugurean_tlati.javaproject.repository;

import com.ciugurean_tlati.javaproject.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}