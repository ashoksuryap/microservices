package org.ashok.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;



@RestController
public class BookController {

	@Autowired
	RestTemplate restTemplate;

	@RequestMapping(value="/books", method = RequestMethod.GET)
	public List<BookVO> getBooks() {


		
		List<BookVO> booksToReturn = Arrays.asList(
				new BookVO("title1", "ashok", "123"),
				new BookVO("title2", "surya", "456"),
				new BookVO("title3", "raj", "789")
		);
		
		for (BookVO book : booksToReturn) {
			List<ReviewVO> reviews = restTemplate.getForObject("http://review-service/review/books/"+book.getIsbn(), List.class);

			book.setReviews(reviews);
		}

		return booksToReturn;
	}




}