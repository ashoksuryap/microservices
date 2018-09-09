package org.ashok.service;

import java.util.List;

public interface ReviewServiceClient {
    List<ReviewVO> getReviews(BookVO book);
}
