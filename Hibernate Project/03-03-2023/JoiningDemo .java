package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class JoiningDemo {
	public static void main(String args[])
	{
		
		SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session= factory.openSession();
		
//	Transaction tx= session.beginTransaction();
//		
//		Book book= new Book();
//		book.setBookName("Hibernate");
//		book.setBookPages(670);
//		book.setBookPrice(340);
//	
//	Author author=new Author();
//	author.setaId(101);
//		author.setName("Gravin king");
//		
//		book.setAuthor(author);
//		
//		session.save(author);
//		session.save(book);
//		tx.commit();
		
		Book book2=session.get(Book.class, 3);
	System.out.println("Book Name : "+book2.getBookName() + " Author Name: "+book2.getAuthor().getName());
		System.out.println();
		
	session.close();	
	factory.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
