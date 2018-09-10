package org.ashok.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "review-service", fallback = HystrixReviewsFallback.class)
public interface ReviewServiceFeignClient {
    @RequestMapping(method = RequestMethod.GET, value = "/review/books/{isbn}")
    public List<ReviewVO> getReviews(@PathVariable("isbn") String isbn);
}