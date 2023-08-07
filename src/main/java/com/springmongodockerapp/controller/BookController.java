package com.springmongodockerapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springmongodockerapp.entities.Book;
import com.springmongodockerapp.service.BookService;

@RestController
public class BookController {
	
	@Autowired
	private BookService bookService;

	@PostMapping("/addBooks")
	public Book createBook(@RequestBody Book book) {
		return bookService.createBooks(book);
	}


}
