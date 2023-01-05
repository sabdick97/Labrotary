package Practice;

public class Book {
	private int bookid;
	private String bookName;
	private String author;
	private double bookPrice;
	public int getBookid() {
		return bookid;
	}
	//Getter and Setter method
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(double bookPrice) {
		this.bookPrice = bookPrice;
	}
	public Book(int bookid, String bookName, String author, double bookPrice) {
		super();
		this.bookid = bookid;
		this.bookName = bookName;
		this.author = author;
		this.bookPrice = bookPrice;
	}
	// constructor using super-class
	public Book() {
		super();
		
	}

}
