package org.ashok.service;

public class ReviewVO {

	private String review;

	private String createdBy;

	public ReviewVO(String review, String createdBy) {
		this.review = review;
		this.createdBy = createdBy;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

}
