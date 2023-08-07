package com.springmongodockerapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.springmongodockerapp.entities.Book;

public interface BookRepository extends MongoRepository<Book, Integer> {

}
