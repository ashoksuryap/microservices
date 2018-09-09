package org.ashok.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/review")
public class ReviewController {

	@RequestMapping(value = "/books/{isbn}")
	public List<ReviewVO> getAllReviews(@PathVariable("isbn") String isbn) {
		List<ReviewVO> reviewsToReturn = Arrays.asList(
				new ReviewVO("good","test1"),
				new ReviewVO("average","test2"),
				new ReviewVO("worst","test3")

		);

		return reviewsToReturn;

	}

}
