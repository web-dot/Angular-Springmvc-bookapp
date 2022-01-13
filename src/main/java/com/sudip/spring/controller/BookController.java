package com.sudip.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sudip.spring.model.Book;
import com.sudip.spring.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bookService;
	
	
	//in real applications ResponseEntity should not be the return type
	//we will create our custom class and we will add our custom properties
	//liske response code, response messag and response object.
	@GetMapping("/api/book")
	public ResponseEntity<List<Book>> list(){
		List<Book> list = bookService.list();
		return ResponseEntity.ok().body(list);
	}
}
