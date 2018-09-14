package org.ashok.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


@RestController
public class BookController {

	private static final Logger LOG = Logger.getLogger(BookController.class.getName());

	@Autowired
	private ReviewServiceFeignClient reviewServiceClient;

	@RequestMapping(value="/books", method = RequestMethod.GET)
	public List<BookVO> getBooks() {
		LOG.info("Get Books");
		List<BookVO> booksToReturn = Arrays.asList(
				new BookVO("title1", "ashok", "123"),
				new BookVO("title2", "surya", "456"),
				new BookVO("title3", "raj", "789")
		);
		LOG.info("Get Reviews");
		for (BookVO book : booksToReturn) {
			List<ReviewVO> reviews = reviewServiceClient.getReviews(book.getIsbn());

			book.setReviews(reviews);
		}
		LOG.info("Return Books with reviews");
		return booksToReturn;
	}

}