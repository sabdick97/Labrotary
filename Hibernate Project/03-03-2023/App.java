package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class App 
{
    public static void main( String[] args )
    {
    	
//    Configuration cfg=new Configuration();
//    cfg.configure("hibernate.cfg.xml");
//    SessionFactory factory=cfg.buildSessionFactory();
    
    //configuring the session factory using the configuration xml file
    
    SessionFactory factory= new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
    		Session session = factory.openSession();//opening our session using session factory
    
    //Transaction tx= session.beginTransaction();//beginning our transaction
    
    	
//    Book book1=new Book();
//    book1.setBookName("AWS");
//    book1.setBookPages(489);
//    book1.setBookPrice(500);
//    
//    Book book2=new Book();
//    book2.setBookName("Java");
//    book2.setBookPages(309);
//    book2.setBookPrice(470);
//    
//    session.save(book1);
//    session.save(book2);
//    
//    tx.commit();//calling the commit method//commit our transation
//    	
//    	retrieve data/record from database
    		//using get method
    		//if the object is not found it will return null
    		Book book= session.get(Book.class, 3);
    		System.out.println("Book Name: "+book.getBookName()+"Book Price: "+book.getBookPrice());
    		System.out.println(book);
    		
    		
    		//using load method 
    		//if the object is not found it will return ObjectNotFoundException
    		Book book1= session.load(Book.class, 3);
    	//	System.out.println("Book Name: "+book1.getBookName()+"Book Price: "+book1.getBookPrice());
    	//System.out.println(book1);
    	
    	
    	session.close();
    	Session session2=factory.openSession();
    	Book book3=session2.get(Book.class, 2);
    	System.out.println("Book Name: "+book3.getBookName()+"Book Price: "+book3.getBookPrice());
    	
    	System.out.println((book3));
    	session2.close();
    	factory.close();
    	
