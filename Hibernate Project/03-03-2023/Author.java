package com.hibernate;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Author {
	@Id
	private int aId;
	@Column(name="author_name", length=20)
	private String name;
	@OneToMany
	private List<Book> books;
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	@Override
	public String toString() {
		return "Author [aId=" + aId + ", name=" + name + ", books=" + books + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public Author() {
		super();
		
	}
	public Author(int aId, String name, List<Book> books) {
		super();
		this.aId = aId;
		this.name = name;
		this.books = books;
	}

}
