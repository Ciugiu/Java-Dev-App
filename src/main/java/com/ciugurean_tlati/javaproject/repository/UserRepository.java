package com.ciugurean_tlati.javaproject.repository;

import com.ciugurean_tlati.javaproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}