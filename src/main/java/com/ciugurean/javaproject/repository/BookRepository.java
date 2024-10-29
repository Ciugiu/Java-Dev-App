package com.ciugurean.javaproject.repository;

import com.ciugurean.javaproject.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}