package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.ManyToAny;

@Entity
@Table (name="book_details")
@NamedQuery(name="book.byname", query="from Book where bookname=?1")
public class Book {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int bookId;
	
	@Column(name="book_name",length=20)
	private String bookName;
	@Column(name="book_price",length=10)
	private double bookPrice;
	@Column(name="pages", length=10)
	private int bookPages;
	
	
	
	

@ManyToOne
	private Author author;


	public int getBookId() {
		return bookId;
	}


	public void setBookId(int bookId) {
		this.bookId = bookId;
	}


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


	public int getBookPages() {
		return bookPages;
	}


	public void setBookPages(int bookPages) {
		this.bookPages = bookPages;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}
	public Book(int bookId, String bookName, double bookPrice, int bookPages, Author author) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookPages = bookPages;
		this.author = author;
	}


	public Book() {
		super();
		
	}


	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPrice=" + bookPrice + ", bookPages="
				+ bookPages + ", author=" + author + "]";
	}
}
