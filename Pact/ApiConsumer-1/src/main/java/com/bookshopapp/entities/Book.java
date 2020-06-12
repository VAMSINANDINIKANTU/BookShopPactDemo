package com.bookshopapp.entities;

public class Book {
	public Long id;
	public String bookName;
	public double bookPrice;
	public String publisherName;
	public int publishingYear;
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public int getPublishingYear() {
		return publishingYear;
	}
	public void setPublishingYear(int publishingYear) {
		this.publishingYear = publishingYear;
	}
	public Book(String bookName, double bookPrice, String publisherName, int publishingYear) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.publisherName = publisherName;
		this.publishingYear = publishingYear;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", bookPrice=" + bookPrice + ", publisherName="
				+ publisherName + ", publishingYear=" + publishingYear + "]";
	}

}
