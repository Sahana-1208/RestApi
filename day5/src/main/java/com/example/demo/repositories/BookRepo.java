package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Book;

public interface BookRepo extends JpaRepository<Book,Integer> {

}
