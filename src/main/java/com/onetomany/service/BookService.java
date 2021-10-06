package com.onetomany.service;

import org.springframework.stereotype.Component;

import com.onetomany.entity.Book;

@Component
public interface BookService {
	public Book saveBook(Book book);
	public Book findByBookId(int bookId);

}
