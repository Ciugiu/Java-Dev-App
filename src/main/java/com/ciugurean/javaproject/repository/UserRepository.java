package com.ciugurean.javaproject.repository;

import com.ciugurean.javaproject.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}