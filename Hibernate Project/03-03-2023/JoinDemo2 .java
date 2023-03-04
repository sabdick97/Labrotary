package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class JoinDemo2 {

	public static void main(String[] args) {
		SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session session =factory.openSession();
       Transaction tx= session.beginTransaction();
       
//       Author author1=new Author();
//       author1.setaId(200);
//       author1.setName("Bala Swami");
//       
//       Book book1=new Book();
//       book1.setBookName("C");
//       book1.setBookPages(600);
//       book1.setBookPrice(500);
//       book1.setAuthor(author1);
//       
//       Book book2=new Book();
//       book2.setBookName("Angular");
//       book2.setBookPages(490);
//       book2.setBookPrice(400);
//       book2.setAuthor(author1);
//       
//       //array list to store many books
//       List<Book>books=new ArrayList<Book>();
//       books.add(book1);
//       books.add(book2);
//       session.save(book1);
//       session.save(book2);
//       author1.setBooks(books);
//       session.save(author1);
//       tx.commit();
//       
       //fetch book and author details
       
//      Author auth=session.get(Author.class, 200);
//     System.out.println(auth.getName());
//      
//     System.out.println();
//      System.out.println("Book Details:");
//      for(Book book:auth.getBooks())
//     
//      System.out.println("Book Name : "+book.getBookName()+" Book Pages : "+book.getBookPages()+" Book Price : "+book.getBookPrice());
//       
//       System.out.println();
//       //using SQL
//       String query ="from Author";
//       Query q=session.createQuery(query);
//       List<Author> list= q.getResultList();
//       
//       for(Author au:list)
//    	   
//       {
//    	   System.out.println(au.getName());
//       }
//    	   
    	   
    	   //using HQL
       //fetch details query
//       
//       String query1="from Book where bookName=: name or bookPrice=:price";//select *from book;
//       Query q1=session.createQuery(query1);
//       q1.setParameter("name", "Hibernate");
//       q1.setParameter("price", 499.99);
//       
//       List<Book> list1=q1.getResultList();
//       
//       for(Book b:list1)
//       {
//    	   
//    	  System.out.println("Book Name : "+b.getBookName());
//    	  System.out.println("Book Price : "+b.getBookPrice());
//    	  System.out.println("Book Author : "+b.getAuthor());
//       }
       
       //delete query
//      Query q2=session.createQuery("Delete from book where bookname+:b");
//      q2.setParameter("b", "AWS");
//      int row=q2.executeUpdate();
//      System.out.println(row+ "record deleted sucessfully!!");
//      tx.commit();
       
       //Update query
      Query q3=session.createQuery("Update Book set bookName =:name,bookPages=:page,"+"bookPrice=:price where bookId=:id");
      q3.setParameter("id", 1);
      q3.setParameter("name", "AWS");
      q3.setParameter("page", 100);
      q3.setParameter("price", 239.00);
      
      int row1=q3.executeUpdate();
      System.out.println(row1+ "record update sucessfully");
      
     //List<Book>list2=q3.getResultList();
     
     
    // for(Book book5:list2)
     //{
   // 	 System.out.println("Book Name : "+book5.getBookName()+"Book Price : "+book5.getBookPrice()+"Book Pages "+book5.getBookPages());
    	 	
    	 		
    	 
    	 
  //   }
      tx.commit();
      
//      session.close();
//      session.close();
      //using named query
//      Query q3= session.getNamedQuery("book.byname");
//      q3.setString(1,"Hibernate");
//      List<Book> li=q3.list();
//      for(Book b:li)
//      {
//    	  System.out.println(b.getBookName()+" "+b.getBookPrice());
//    	  
//      }
      session.close();
      factory.close();
       }  
	
	
       
	}


