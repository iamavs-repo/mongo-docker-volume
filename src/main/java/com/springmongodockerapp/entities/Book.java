package com.springmongodockerapp.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "BookManagementSystem")
public class Book {
	
	@Id
	private int bookId;
	private String bookName;
	private String bookGenre;
	private String authorName;
	private String bookPrice;

}
