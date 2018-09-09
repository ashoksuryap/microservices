package org.ashok.service;

import java.util.List;

public class BookVO {
	
	private String title;

	private String author;

	private String isbn;
	
	private Integer Inventory;
	
	private List<ReviewVO> reviews;

	public BookVO(String title, String author, String isbn) {
		this.title = title;
		this.author = author;
		this.isbn = isbn;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getInventory() {
		return Inventory;
	}

	public void setInventory(Integer inventory) {
		Inventory = inventory;
	}

	public List<ReviewVO> getReviews() {
		return reviews;
	}

	public void setReviews(List<ReviewVO> reviews) {
		this.reviews = reviews;
	}

	
}
