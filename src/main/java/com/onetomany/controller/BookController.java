package com.onetomany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.onetomany.entity.Book;
import com.onetomany.service.BookService;

@RestController
@RequestMapping(value = "/book")
public class BookController {
	@Autowired
	BookService bookService;
	
	@PostMapping(value="/savebook")
	@ResponseBody
	 public Book saveBook(@RequestBody Book book) {
		 Book bookResponse=bookService.saveBook(book);
	return bookResponse;	 
	 }
	@GetMapping(value="/{bookId}")
	@ResponseBody
	public Book getBookDetails(@PathVariable int bookId) {
		Book bookResponse=bookService.findByBookId(bookId);
		return bookResponse;
	}

}
