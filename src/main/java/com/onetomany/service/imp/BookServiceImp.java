package com.onetomany.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.onetomany.entity.Book;
import com.onetomany.entity.Story;
import com.onetomany.repository.BookRepository;
import com.onetomany.service.BookService;
@Service
public class BookServiceImp implements BookService {
		@Autowired
		private BookRepository bookRepository;
		
		public Book saveBook(Book book) {
			List<Story> storyList=new ArrayList<>();
			
			//frst story
			Story story1=new Story();
			story1.setStoryName("Collections Frameworks");
			Story story2=new Story();
			story2.setStoryName("Stream API");
			
			//for one to many
			storyList.add(story1);
			storyList.add(story2);
			
			
			//for Many to one
			story1.setBook(book);
			story2.setBook(book);
			
			book.setStoryList(storyList);
			book=bookRepository.save(book);
			
			return book;
		}
		public Book findByBookId(int bookId) {
			Book book=bookRepository.findByBookId(bookId);
			return book;
		}

}
