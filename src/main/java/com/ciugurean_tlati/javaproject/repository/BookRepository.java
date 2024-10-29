package com.ciugurean_tlati.javaproject.repository;

import com.ciugurean_tlati.javaproject.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}