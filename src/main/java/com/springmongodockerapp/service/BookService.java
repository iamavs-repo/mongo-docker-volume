package com.springmongodockerapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springmongodockerapp.entities.Book;
import com.springmongodockerapp.repository.BookRepository;

@Service
public class BookService {
	
	@Autowired
	private BookRepository bookRepository;

	public Book createBooks(Book book) {

		return bookRepository.save(book);

	}

}
