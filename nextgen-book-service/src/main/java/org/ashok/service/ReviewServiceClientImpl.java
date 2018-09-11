package org.ashok.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;
import java.util.List;

@Service
public class ReviewServiceClientImpl implements ReviewServiceClient{

    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "callReviewService_Fallback")
    @Override
    public List<ReviewVO> getReviews(String isbn) {
        return restTemplate.getForObject("http://review-service/review/books/"+isbn, List.class);
    }

    @SuppressWarnings("unused")
    private List<ReviewVO> callReviewService_Fallback(BookVO book) {

        System.out.println("Review Service is down!!! fallback route enabled...");

        return Collections.emptyList();
    }
}
