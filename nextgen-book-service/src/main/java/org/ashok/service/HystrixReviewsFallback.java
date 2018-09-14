package org.ashok.service;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

@Component
public class HystrixReviewsFallback implements ReviewServiceFeignClient{
    private static final Logger LOG = Logger.getLogger(HystrixReviewsFallback.class.getName());
    public List<ReviewVO> getReviews(String isbn) {
        LOG.info("Return Reviews from Fallback");
        return new ArrayList<>();
    }
}
