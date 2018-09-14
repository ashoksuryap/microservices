package org.ashok.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;


@RestController
@RequestMapping("/review")
public class ReviewController {

	private static final Logger LOG = Logger.getLogger(ReviewController.class.getName());

	@RequestMapping(value = "/books/{isbn}")
	public List<ReviewVO> getAllReviews(@PathVariable("isbn") String isbn) {
		LOG.info("Get all reviews for book isbn:" + isbn);
		List<ReviewVO> reviewsToReturn = Arrays.asList(
				new ReviewVO("good","test1"),
				new ReviewVO("average","test2"),
				new ReviewVO("worst","test3")

		);
		LOG.info("Reurn from getAllReviews");
		return reviewsToReturn;

	}

}
