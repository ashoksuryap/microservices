package org.ashok.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class HystrixReviewsFallback implements ReviewServiceFeignClient{

    public List<ReviewVO> getReviews(String isbn) {
        return new ArrayList<>();
    }
}
